public class Main {
    static void testSmartDevice(SmartDevice smartDevice){
        smartDevice.turnOn();
        smartDevice.turnOff();
    }
    
    public static void main(String[] args) {
        OldSmartBulb oldSmartBulb = new OldSmartBulb();
        LegacyHeater legacyHeater = new LegacyHeater();

        testSmartDevice(new OldBulbAdapter(oldSmartBulb));
        testSmartDevice(new LegacyAdapter(legacyHeater));

    }
}
