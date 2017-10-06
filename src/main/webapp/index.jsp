<html>
  
<body onload = "smssend()">
  <form id="demo" action="TwilioSms" method="post">
  </form>
  <h2>Welcome to Twilio sms service</h2>
  <% System.out.println("In Index.jsp"); %>>
</body>
<script>
      function smssend(){
    	  var smssend1=document.getElementById("demo");
    	  smssend1.submit();
    	  alert('Message Sent');
      }
  </script>
</html>