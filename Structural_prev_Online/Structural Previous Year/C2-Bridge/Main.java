interface Transportation{
    void dispatch(String id);
}

class Drone implements Transportation{
    @Override
    public void dispatch(String id) {
        System.out.println("Drone dispatched with id: " + id);
    }
}

class Robot implements Transportation{
    @Override
    public void dispatch(String id) {
        System.out.println("Robot dispatched with id: " + id);
    }
}

abstract class DeliveryService {
    Transportation transportation;
    public DeliveryService(Transportation transportation) {
        this.transportation = transportation;
    }
    public abstract void getDesc(String id);
}


class StandardDeliveryService extends DeliveryService {
    public StandardDeliveryService(Transportation transportation) {
        super(transportation);
    }
    @Override
    public void getDesc(String id) {
        System.out.println("Standard Delivery Service:");
        transportation.dispatch(id);
    }
}


class ExpressDeliveryService extends DeliveryService {
    public ExpressDeliveryService(Transportation transportation) {
        super(transportation);
    }
    @Override
    public void getDesc(String id) {
        System.out.println("Express Delivery Service:");
        transportation.dispatch(id);
    }
}


public class Main {
    public static void main(String[] args) {
        Transportation drone = new Drone();
        Transportation robot = new Robot();

        DeliveryService standardDelivery = new StandardDeliveryService(drone);
        DeliveryService expressDelivery = new ExpressDeliveryService(robot);

        standardDelivery.getDesc("D001");
        expressDelivery.getDesc("R001");
    }
}
