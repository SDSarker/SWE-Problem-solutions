public class TestDrive {
    public static void main(String[] args) {
        Order order=new Order();
        System.out.println("Order 1: ");
        order.checkStatus();
        order.proceed("Confirm");
        order.checkStatus();
        order.proceed("Ship");
        order.checkStatus();
        order.proceed("Deliver");
        order.checkStatus();
        order.proceed("Cancel");
        order.checkStatus();


        Order order2=new Order();
        System.out.println("Order 2: ");
        order2.checkStatus();
        order2.proceed("Confirm");
        order2.checkStatus();
        order2.proceed("Cancel");
        order2.checkStatus();

        Order order3=new Order();
        System.out.println("Order 3: ");
        order3.checkStatus();
        order3.proceed("Confirm");
        order3.checkStatus();
        order3.proceed("Deliver");
        order3.checkStatus();
    }
}
