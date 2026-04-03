interface Notification {
    void notify(String msg);
}

class Email implements Notification{

    @Override
    public void notify(String msg) {
        System.out.println("Email : "+msg);
    }
}

class SMS implements Notification{

    @Override
    public void notify(String msg) {
        System.out.println("SMS : "+msg);
    }
}

class PushNot implements Notification{

    @Override
    public void notify(String msg) {
        System.out.println("Push Notification : "+msg);
    }
}

abstract class Decorator implements Notification{
    Notification notification;
    Decorator(Notification notification){
        this.notification=notification;
    }
}

class Encryption extends Decorator{

    Encryption(Notification notification) {
        super(notification);
    }

    @Override
    public void notify(String msg) {
        System.out.println("Encrypted");
        this.notification.notify(msg);
    }
}


class Priority extends Decorator{

    Priority(Notification notification) {
        super(notification);
    }

    @Override
    public void notify(String msg) {
        System.out.println("High Priority");
        this.notification.notify(msg);
    }
}

class Logging extends Decorator{

    Logging(Notification notification) {
        super(notification);
    }

    @Override
    public void notify(String msg) {
        System.out.println("Logged in");
        this.notification.notify(msg);
    }
}


public class Main {
    public static void main(String[] args) {
        Notification notification= new Email();
        notification.notify("Notification 1");
        System.out.println();

        notification=new Encryption(notification);
        notification= new Priority(notification);
        notification.notify("Notification 2");
        System.out.println();

        notification= new Logging(notification);
        notification.notify("Notification 3");

    }
}
