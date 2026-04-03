public class Transaction {
    String type;
    int from;
    int to;
    public Transaction(String type,int from,int to){
        this.type=type;
        this.to=to;
        this.from=from;
    }

    public void show(){
        System.err.println("Type: "+this.type);
        System.out.println("From: "+this.from);
        System.out.println("To: "+this.to);
    }
}
