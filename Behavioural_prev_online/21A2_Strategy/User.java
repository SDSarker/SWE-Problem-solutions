public class User {
    Notification notification;
    User(Notification notification){
        this.notification=notification;
    }
    public void changeNotification(Notification notification){
        this.notification=notification;
    }

    public void notifyUser(String event){
        notification.notify(event);
    }
}
