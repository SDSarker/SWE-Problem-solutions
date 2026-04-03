public class TestDrive {
    public static void main(String[] args) {
        User user=new User(new EmailNotification());
        user.notifyUser("Low balance");
        user.changeNotification(new SMSNotification());
        user.notifyUser("Promotion");
    }
}
