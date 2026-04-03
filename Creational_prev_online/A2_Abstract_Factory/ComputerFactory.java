

public class ComputerFactory {
    ComponentFactory componentFactory;
    public ComputerFactory(ComponentFactory componentFactory){
        this.componentFactory=componentFactory;
    }

    public Computer getComputer(){
        return new Computer(componentFactory.getModel(),componentFactory.getDisplay(), componentFactory.getProcessor());
    }
}
