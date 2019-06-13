public class CommunicationDevice {
    public CommunicationDevice(int speed) {
        NameDevice = "CommunicationDevice";
        DelayDevice = 0;
        this.speed = speed;
    }
    public String NameDevice;
    public int DelayDevice;
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public String GetNameDevice() {
        return NameDevice;
    }
    public int GetDelayDevice() {
        return DelayDevice;
    }

}
