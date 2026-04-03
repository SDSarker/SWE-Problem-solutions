public class OldBulbAdapter implements SmartDevice{
    OldSmartBulb oldSmartBulb;
    OldBulbAdapter(OldSmartBulb oldSmartBulb){
        this.oldSmartBulb=oldSmartBulb;
    }

    @Override
    public void turnOn() {
        this.oldSmartBulb.powerOn();
    }

    @Override
    public void turnOff() {
        this.oldSmartBulb.powerOff();
    }
    
}
