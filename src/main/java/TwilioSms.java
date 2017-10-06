

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class TwilioSms extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public TwilioSms() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().println("Hi aniket!!");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		System.out.println("In do post");
		String accountSid = "ACe412747940626401d88db6972723a1f3";
		String authToken = "8b8083c5308e406cbae6a2591844bbaf";

		Twilio.init(accountSid, authToken);
		Message message = Message.creator(
				new PhoneNumber("+12016162144"), // to
				new PhoneNumber("+12017333018"), // from
				"Hey how are you" // body
		).create();

		System.out.println(message.getSid());}

}
