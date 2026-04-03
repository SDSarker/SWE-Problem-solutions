import java.util.ArrayList;
import java.util.List;

public class Stock {
    String name;
    int price;
    private List<Observer> observers=new ArrayList<>();
    Stock(String name,int price){
        this.name=name;
        this.price=price;
    }
    
    public void registerObserver(Observer observer){
        if(observers.indexOf(observer)>=0){
            
            System.out.println("Observer already subscribed");
        }
        else{
            observers.add(observer);
        }
    }

    public void removeObserver(Observer observer){
        if(observers.indexOf(observer)>=0){
            observers.remove(observer);
        }
        else{
            System.out.println("Observer doesn't exist");
        }
    }

    public void setPrice(int price){
        if(this.price!=price){
            notifyUser(this.price, price);
            this.price=price;
            
        }
    }

    void notifyUser(int p, int n){
        for(Observer i: observers){
            i.update("Price of stock "+name+" changed from "+p+" to "+n);
        }
    }

}
