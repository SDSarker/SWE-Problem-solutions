public class GraphWidg implements Widget{

    @Override
    public void update(int price) {
        System.out.println("New Data point "+price+" plotted");
    }
}
