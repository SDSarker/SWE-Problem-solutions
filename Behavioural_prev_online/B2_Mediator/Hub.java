public class Hub implements Mediator{
    private LightSensor lightsensor;
    private Blinds blinds;
    private AirConditioner airConditioner;

    Hub(){
        lightsensor=new LightSensor(this);
        blinds=new Blinds(this);
        airConditioner=new AirConditioner(this);
    }

    @Override
    public void notify(Component component, String event) {
        if (component instanceof LightSensor && event.equals("High Brightness")){
            blinds.CloseBlind();
        }
        else if(component instanceof Blinds && event.equals("Blind closed")){
            airConditioner.turnOn();
        }
    }

    public LightSensor getLightSensor(){
        return lightsensor;
    }
    
}
