public class Component {
    private Mediator mediator;
    Component(Mediator mediator){
        this.mediator=mediator;
    }

    public void trigger(String event){
        mediator.notify(this,event);
    }
}
