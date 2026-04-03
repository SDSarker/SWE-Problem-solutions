public class Client {
    public static void main(String[] args) {
        Director director1=new Director(new FormalDocBuilder());
        director1.getLetter();
        director1.getResume();

        Director director2=new Director(new InformalDocBuilder());
        director2.getLetter();
        director2.getResume();
    }
}
