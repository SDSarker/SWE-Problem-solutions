public class UserObserver implements Observer{

    @Override
    public void update(String event) {
        System.out.println(event);
    }
    
}
