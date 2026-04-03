public class TestDrive {
    public static void main(String[] args) {
        Logger lg=Logger.getInstace();
        lg.addTracns("Deposit", 123, 456);
        Logger lg1=Logger.getInstace();
        lg1.addTracns("withdrawal", 148, 267);
        Logger lg2=Logger.getInstace();
        lg2.addTracns("Transfer", 987, 354);

        lg.showlog();
    }
}
