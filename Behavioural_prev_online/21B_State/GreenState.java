public class GreenState implements State{
    TrafficLight trafficLight;

    GreenState(TrafficLight trafficLight){
        this.trafficLight=trafficLight;
    }

    @Override
    public void handle() {
        System.out.println("Light :-> Green");
        try {
            Thread.sleep(10000); // Wait for 1 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        trafficLight.setState(trafficLight.getRed());
    }
}
