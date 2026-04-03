//We are using abstract factory pattern here and this is the Abstract Factory



public abstract class ComponentFactory {
    public abstract Display getDisplay();
    public abstract Processor getProcessor();
    public abstract String getModel();
}
