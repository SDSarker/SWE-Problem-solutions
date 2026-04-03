public class StateDelivered implements State{
    Order order;

    StateDelivered(Order order){
        this.order=order;
    }

    @Override
    public void confirmOrder() {
        System.out.println("Error: already delivered");
    }

    @Override
    public void shipParcel() {
        System.out.println("Error: already delivered");
    }

    @Override
    public void deliverParcel() {
        System.out.println("Error: already delivered");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Error: already delivered");
    }

    @Override
    public void show() {
        System.out.println("Status : Delivered");
    }
    
}
