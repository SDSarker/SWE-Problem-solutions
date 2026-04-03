public class LegacyAdapter implements SmartDevice{
    LegacyHeater legacyHeater;
    LegacyAdapter(LegacyHeater legacyHeater){
        this.legacyHeater=legacyHeater;
    }

    @Override
    public void turnOn() {
        this.legacyHeater.startHeating();
    }

    @Override
    public void turnOff() {
        this.legacyHeater.stopHeating();
    }
}
