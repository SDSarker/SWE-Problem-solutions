public class Meal {
    String starter;
    String main;
    String dessert;
    public Meal(String starter,String main,String dessert){
        this.starter=starter;
        this.main=main;
        this.dessert=dessert;
    }

    @Override
    public String toString() {
        return ""+starter+" "+main+" "+dessert;
    }

};
