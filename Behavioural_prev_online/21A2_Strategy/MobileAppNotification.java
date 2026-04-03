public class MobileAppNotification implements Notification{

    @Override
    public void notify(String event) {
        System.out.println("Notification via Mobile app "+event);
    }

}