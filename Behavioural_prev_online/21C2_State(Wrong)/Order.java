public class Order {
    State statePlaced;
    State stateConfirmed;
    State stateDelivered;
    State stateCancelled;
    State stateShipped;

    State currenState;

    Order(){
        statePlaced=new StatePlaced(this);
        stateConfirmed=new StateConfirmed(this);
        stateDelivered=new StateDelivered(this);
        stateCancelled=new StateCancelled(this);
        stateShipped=new StateShipped(this);

        this.currenState=statePlaced;
    }

    public void proceed(String action){
        if (action.equals("Confirm")){
            currenState.confirmOrder();
        }
        else if(action.equals("Ship")){
            currenState.shipParcel();
        }
        else if(action.equals("Deliver")){
            currenState.deliverParcel();
        }
        else if(action.equals("Cancel")){
            currenState.cancelOrder();
        }
    }

    public void setState(State state){
        this.currenState=state;
    }

    public State getCurrenState() {
        return currenState;
    }
    public State getStateCancelled() {
        return stateCancelled;
    }
    public State getStateConfirmed() {
        return stateConfirmed;
    }
    public State getStateDelivered() {
        return stateDelivered;
    }
    public State getStatePlaced() {
        return statePlaced;
    }
    public State getStateShipped() {
        return stateShipped;
    }

    public void checkStatus(){
        currenState.show();
    }
}
