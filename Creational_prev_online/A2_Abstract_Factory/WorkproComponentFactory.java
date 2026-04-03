

public class WorkproComponentFactory extends ComponentFactory {

    @Override
    public Display getDisplay() {
        return new DisplayIPS();
    }

    @Override
    public Processor getProcessor() {
        return new ProcessorIntel();
    }

    @Override
    public String getModel() {
        return "WorkPro";
    }
    
}
