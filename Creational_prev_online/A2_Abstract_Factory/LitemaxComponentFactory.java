

public class LitemaxComponentFactory extends ComponentFactory {

    @Override
    public Display getDisplay() {
        return new DisplayOled();
    }

    @Override
    public Processor getProcessor() {
        return new ProcessorIntel();
    }

    @Override
    public String getModel() {
        return "LiteMax";
    }
    
}
