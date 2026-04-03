public class YellowState implements State{
    TrafficLight trafficLight;

    YellowState(TrafficLight trafficLight){
        this.trafficLight=trafficLight;
    }

    @Override
    public void handle() {
        System.out.println("Light :-> Yellow");
        try {
            Thread.sleep(2000); // Wait for 1 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        trafficLight.setState(trafficLight.getGreen());
    }
}
