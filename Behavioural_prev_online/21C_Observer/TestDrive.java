public class TestDrive {
    public static void main(String[] args) {
        Stock s1=new Stock("Meta", 20);
        Stock s2=new Stock("NVDIA", 30);

        Observer u1=new UserObserver();
        Observer u2=new UserObserver();

        s1.registerObserver(u1);
        s1.registerObserver(u2);
        s2.registerObserver(u2);

        s1.setPrice(50);
        s2.setPrice(40);

        s1.removeObserver(u2);

        s1.setPrice(55);
    }    
}
