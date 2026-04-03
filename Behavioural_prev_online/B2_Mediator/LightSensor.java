public class LightSensor extends Component{

    LightSensor(Mediator mediator) {
        super(mediator);
    }

    public void DetectBrightness(){
        System.out.println("High brightness detected");
        this.trigger("High Brightness");
    }
}
