public class StateConfirmed implements State{
    Order order;

    StateConfirmed(Order order){
        this.order=order;
    }

    @Override
    public void confirmOrder() {
        System.out.println("Error : Already Confirmed");
    }

    @Override
    public void shipParcel() {
        order.setState(order.getStateShipped());
    }

    @Override
    public void deliverParcel() {
        System.out.println("Error : Yet to be shipped");
    }

    @Override
    public void cancelOrder() {
        order.setState(order.getStateCancelled());
    }

    @Override
    public void show() {
        System.out.println("Status : Confirmed"); 
    }
    
    
}
