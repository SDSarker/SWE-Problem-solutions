import java.util.List;

public class textdrive {
    public static void main(String[] args) {
        Component laptop= new Laptop();
        Component phone= new Phone();

        Composite composite= new Composite(List.of(laptop,phone));

        System.out.println(composite.calculatePrice());
    }

    
}
