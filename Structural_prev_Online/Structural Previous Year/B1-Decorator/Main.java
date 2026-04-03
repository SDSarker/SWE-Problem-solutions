public class Main {
    public static void main(String[] args) {
        double basePrice=1200;
        Purchase purchase= new ProductA(basePrice);
        System.out.println("Product 1: "+ purchase.getDesc());
        System.out.println("Price : "+purchase.calculatePrice());
        
        Purchase discountedPurchase=new LoyaltyDiscount(purchase);
        discountedPurchase=new SeasonalDiscount(discountedPurchase);

        if (basePrice>10000){
            discountedPurchase=new HighValueDiscount(discountedPurchase);
        }

        System.out.println("Product 2 : "+discountedPurchase.getDesc());
        System.out.println("Price : "+discountedPurchase.calculatePrice());
    }
}
