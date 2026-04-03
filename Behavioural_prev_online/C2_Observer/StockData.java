import java.util.ArrayList;
import java.util.List;

public class StockData {
    private List<Widget> widgets=new ArrayList<>();
    private int price=0;

    public void setPrice(int price){
        if (this.price!=price){
            this.price=price;
            this.notifyWidgets();
        }
    }

    public void addWidget(Widget widget){
        widgets.add(widget);
    }
    public void removeWidget(Widget widget){
        widgets.remove(widget);
    }
    public void notifyWidgets(){
        for(Widget i:widgets){
            i.update(price);
        }
    }
}
