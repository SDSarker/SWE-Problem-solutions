interface Payment {
    public void pay();
}

class CreditPayment implements Payment{

    @Override
    public void pay() {
        System.out.println("Payment using Credit card");
    }
}

class PaypalPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment using PayPal");
    }    
}

public class PaymentFactory {
    public Payment getMethod(String str){
        if(str.equals("Credit")){
            return new CreditPayment();
        }
        else if(str.equals("Paypal")){
            return new PaypalPayment();
        }
        else{
            return null;
        }
    }
}
