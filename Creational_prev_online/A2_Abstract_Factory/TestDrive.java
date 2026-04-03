

public class TestDrive {
    public static void main(String[] args) {
        Computer c1,c2;
        
        ComputerFactory Factory1=new ComputerFactory(new WorkproComponentFactory());
        ComputerFactory Factory2=new ComputerFactory(new LitemaxComponentFactory());

        c1=Factory1.getComputer();
        c2=Factory2.getComputer();

        c1.showDetails();
        c2.showDetails();
        
    }
}
