public class CommunicationDevice {
    public CommunicationDevice(int typeosi) {
        NameDevice = "CommunicationDevice";
        DelayDevice = 0;
        this.typeOSI = typeosi;
    }
    public String NameDevice;
    public int DelayDevice;
    private int typeOSI;

    public int gettypeOSI() {
        return typeOSI;
    }


    public String GetNameDevice() {
        return NameDevice;
    }
    public int GetDelayDevice() {
        return DelayDevice;
    }

}
