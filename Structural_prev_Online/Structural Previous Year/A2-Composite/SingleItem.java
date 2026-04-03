public class SingleItem implements Component {
    String name;
    int price;
    int weight;

    SingleItem(String name, int price,int weight){
        this.name=name;
        this.price=price;
        this.weight=weight;
    }
    
    @Override
    public int calculatePrice() {
        return price;
    }

    @Override
    public int calculateWeight() {
        return weight;
    }

    @Override
    public void showDetails() {
        System.out.println("Product name : "+this.name);
        System.out.println("Price : "+this.price);
        System.out.println("Weight : "+this.weight);
    }
    
}
