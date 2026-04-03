public class StatePlaced implements State{
    Order order;
    StatePlaced(Order order){
        this.order=order;
    }

    @Override
    public void confirmOrder() {
        order.setState(order.getStateConfirmed());
    }

    @Override
    public void shipParcel() {
        System.out.println("Error, Yet to confirm");
    }

    @Override
    public void deliverParcel() {
        System.out.println("Error, yet to confirm and ship");
    }

    @Override
    public void cancelOrder() {
        order.setState(order.getStateCancelled());
    }

    @Override
    public void show() {
        System.out.println("Status : Order placed");
    }
}
