interface Channel {
    void notify(String msg);
}

class Email implements Channel{

    @Override
    public void notify(String msg) {
        System.out.println("Email : "+msg);
    }
}

class SMS implements Channel{

    @Override
    public void notify(String msg) {
        System.out.println("SMS : "+msg);
    }
}

class Push implements Channel{

    @Override
    public void notify(String msg) {
        System.out.println("Whatsapp : "+msg);
    }
}


abstract class Notification{
    Channel channel;
    Notification(Channel channel){
        this.channel=channel;
    }

    abstract void sendNotification(String msg);
}

class Allert extends Notification{

    Allert(Channel channel) {
        super(channel);
    }

    @Override
    void sendNotification(String msg) {
        this.channel.notify("Warning : "+msg);
    }
}

class Congratulate extends Notification{

    Congratulate(Channel channel) {
        super(channel);
    }

    @Override
    void sendNotification(String msg) {
        this.channel.notify("Congratulations!! "+msg);
    }
}

public class Main {
    public static void main(String[] args) {
        Notification notification=new Allert(new Email());

        notification.sendNotification("You are doomed");
    }
}
