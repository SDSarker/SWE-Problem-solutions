public class TrafficLight {
    public State red;
    public State yellow;
    public State green;

    public State current;
    TrafficLight(){
        red=new RedState(this);
        yellow=new YellowState(this);
        green=new GreenState(this);

        current=red;
    }

    public void changeLight(){
        current.handle();
    }

    public State getGreen() {
        return green;
    }
    public State getRed() {
        return red;
    }
    public State getYellow() {
        return yellow;
    }
    public void setState(State current) {
        this.current = current;
    }
}
