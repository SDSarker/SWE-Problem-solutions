

public class Computer {
    Display display;
    Processor processor;
    String model;
    public Computer(String model,Display display, Processor processor){
        this.display=display;
        this.processor=processor;
        this.model=model;
    }
    public void showDetails(){
        System.out.println("Computer model : "+model);
        System.out.println("Processor : "+processor);
        System.out.println("Display : "+display);
    }
}
