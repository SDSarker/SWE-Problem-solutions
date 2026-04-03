public class LoyaltyDiscount extends DiscountDecorator{

    Purchase basepPurchase;

    LoyaltyDiscount(Purchase purchase){
        this.basepPurchase=purchase;
    }
    
    @Override
    public double calculatePrice() {
        return this.basepPurchase.calculatePrice()*0.10;
    }

    @Override
    public String getDesc() {
        return this.basepPurchase.getDesc()+" with Loyalty Discount";
    }
}
