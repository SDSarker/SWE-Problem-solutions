public class EmailNotification implements Notification{

    @Override
    public void notify(String event) {
        System.out.println("Notification via email "+event);
    }
}
