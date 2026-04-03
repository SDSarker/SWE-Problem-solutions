public class SMSNotification implements Notification{

    @Override
    public void notify(String event) {
        System.out.println("Notification via SMS "+event);
    }
    
}
