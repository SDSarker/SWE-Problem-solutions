public class StateCancelled implements State{
    Order order;
    StateCancelled(Order order){
        this.order=order;
    }
    @Override
    public void confirmOrder() {
        System.out.println("Error : Order Cancelled");
    }

    @Override
    public void shipParcel() {
        System.out.println("Error : Order Cancelled");
    }

    @Override
    public void deliverParcel() {
        System.out.println("Error : Order Cancelled");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Error : Order Cancelled");
    }

    @Override
    public void show() {
        System.out.println("Status : Cancelled");
    }
    
}
