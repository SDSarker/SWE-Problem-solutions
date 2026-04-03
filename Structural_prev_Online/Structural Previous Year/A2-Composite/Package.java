import java.util.ArrayList;
import java.util.List;

public class Package implements Component{
    List<Component> components = new ArrayList<>();
    String name;

    Package(String name,List<Component> components){
        this.components=components;
        this.name=name;
    }

    @Override
    public int calculatePrice() {
        int price=0;

        for(Component component : this.components){
            price+=component.calculatePrice();
        }

        return price;
    }

    @Override
    public int calculateWeight() {
        int weight=0;

        for(Component component : this.components){
            weight+=component.calculateWeight();
        }

        return weight;
    }

    @Override
    public void showDetails() {
        System.out.println("Package name : "+this.name);
        System.out.println("Included items : ");
        for ( Component i: components){
            i.showDetails();
        }
    }
    
}
