public class ProductA implements Purchase{
    double price;
    ProductA(double price){
        this.price=price;
    }

    @Override
    public double calculatePrice() {
        return price;
    }

    @Override
    public String getDesc() {
        return "Base product A";
    }
}
