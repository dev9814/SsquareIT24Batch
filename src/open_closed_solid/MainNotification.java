package open_closed_solid;

public class MainNotification {

	public static void main(String[] args) {
		
		NotificationService service = new NotificationService();
        service.addNotification(new EmailNotification());
        service.addNotification(new SMSNotification());

        service.sendAll("Hello, World!");
	}
}
