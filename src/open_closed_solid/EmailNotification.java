package open_closed_solid;

public class EmailNotification implements Notification{

	@Override
	public void send(String message) {
		System.out.println("Sending email: " + message);
	}
}
