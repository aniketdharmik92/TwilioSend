

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
		String accountSid = "ACe412747940626401d88db6972723a1f3";
		String authToken = "8b8083c5308e406cbae6a2591844bbaf";

		Twilio.init(accountSid, authToken);
		Message message = Message.creator(
				new PhoneNumber("+19173490168"), // to
				new PhoneNumber("+12017333018"), // from
				"Hello from ANIKET DHARMIK CS 643 Fall 2017" // body
		).create();

		System.out.println(message.getSid());}

}
