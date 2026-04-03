public class StateShipped implements State{
    Order order;

    StateShipped(Order order){
        this.order=order;
    }
    
    @Override
    public void confirmOrder() {
        System.out.println("Error : Already Confirmed");
    }

    @Override
    public void shipParcel() {
        System.out.println("Error : Already shipped");
    }

    @Override
    public void deliverParcel() {
        order.setState(order.getStateDelivered());
    }

    @Override
    public void cancelOrder() {
        System.out.println("Error : Can not cancel, already shipped");
    }

    @Override
    public void show() {
        System.out.println("Status : Shipped");
    }
    
    
}
