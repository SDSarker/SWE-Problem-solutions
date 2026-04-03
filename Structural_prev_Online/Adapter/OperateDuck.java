public class OperateDuck {
    public static void main(String[] args) {
        MalardDuck malardduck = new MalardDuck();
        WildTurkey wildturkey= new WildTurkey();
        

        testDuck(malardduck);
        testDuck(new TurkeyAdapter(wildturkey));

    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.swim();
    }
}
