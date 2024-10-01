package open_closed_solid;

public class SMSNotification implements Notification{
	
	@Override
	public void send(String message) {
		System.out.println("Sending SMS: " + message);
	}
}
