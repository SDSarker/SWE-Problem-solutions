import java.util.ArrayList;
import java.util.List;

public class Logger{
    static Logger instance;
    List<Transaction> ls=new ArrayList<Transaction>();

    private Logger(){

    }

    public static Logger getInstace() {
        if (instance==null){
            instance=new Logger();
        }
        return instance;
    }

    public void addTracns(String type, int from,int to){
        ls.add(new Transaction(type, from, to));
    }

    public void showlog(){
        for (Transaction transaction : ls) {
            transaction.show();
        }
    }
};

