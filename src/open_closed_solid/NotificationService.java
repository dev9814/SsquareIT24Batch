package open_closed_solid;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {

	private List<Notification> notifications;
	
	public NotificationService() {
		this.notifications = new ArrayList<>();		
	}
	
	public void addNotification(Notification notification) {
		notifications.add(notification);
	}
	
	public void sendAll(String message) {
	   for (Notification notification : notifications) {
	       notification.send(message);
	   }
	}
}
