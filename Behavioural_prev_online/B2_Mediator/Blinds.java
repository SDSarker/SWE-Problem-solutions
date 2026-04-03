public class Blinds extends Component{

    Blinds(Mediator mediator) {
        super(mediator);
    }

    public void CloseBlind(){
        System.out.println("The blinds are being closed");
        this.trigger("Blind closed");
    }
    
}
