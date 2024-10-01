package srp_solid;

public class Main {

	public static void main(String[] args) {
		
		User user = new User("dev", "dev14@gmail.com");
		
		UserRepository ur = new UserRepository();
		ur.saveUser(user);
		
		EmailService es = new EmailService();
		es.sendEmail(user, "Welcome to our platform");
		
	}
	
}
