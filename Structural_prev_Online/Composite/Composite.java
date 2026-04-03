import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    List<Component> components= new ArrayList<>();

    
    public Composite(List<Component> components) {
        this.components = components;
    }


    @Override
    public double calculatePrice() {
        double price=0;
        for (Component component : components) {
            price+=component.calculatePrice();
        }

        return price;
    }

    public void addComponent(Component component){
        components.add(component);
    }

    public void removeComponent(Component component){
        components.remove(component);
    }
}
