package srp_solid;

public class EmailService {

	public void sendEmail(User user, String message) {
		
		System.out.println("Email sent to " + user.getEmail() + " with message: " + message);
		
	}
	
}
