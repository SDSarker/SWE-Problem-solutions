public class RedState implements State{
    TrafficLight trafficLight;

    RedState(TrafficLight trafficLight){
        this.trafficLight=trafficLight;
    }

    @Override
    public void handle() {
        System.out.println("Light :-> Red");
        try {
            Thread.sleep(5000); // Wait for 1 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        trafficLight.setState(trafficLight.getYellow());
    }
}
