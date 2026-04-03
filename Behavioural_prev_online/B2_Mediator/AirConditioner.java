public class AirConditioner extends Component{
    AirConditioner(Mediator mediator) {
        super(mediator);
    }

    public void turnOn(){
        System.out.println("Air conditioner is being turned on");
    }
    
}
