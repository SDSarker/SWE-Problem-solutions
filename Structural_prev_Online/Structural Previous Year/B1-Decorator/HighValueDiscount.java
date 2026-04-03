public class HighValueDiscount extends DiscountDecorator{
    Purchase basepPurchase;

    HighValueDiscount(Purchase purchase){
        this.basepPurchase=purchase;
    }
    
    @Override
    public double calculatePrice() {
        return this.basepPurchase.calculatePrice()*0.02;
    }

    @Override
    public String getDesc() {
        return this.basepPurchase.getDesc()+" with High-Value Discount";
    }
}
