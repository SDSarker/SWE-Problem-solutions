public class SeasonalDiscount extends DiscountDecorator{
    Purchase basepPurchase;

    SeasonalDiscount(Purchase purchase){
        this.basepPurchase=purchase;
    }
    
    @Override
    public double calculatePrice() {
        if (this.basepPurchase.calculatePrice()>100){
            return this.basepPurchase.calculatePrice()-100;
        }
        else{
            return 0;
        }
    }

    @Override
    public String getDesc() {
        return this.basepPurchase.getDesc()+" with Seasonal Discount";
    }
}
