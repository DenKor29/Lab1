public class Modem extends CommunicationDevice {
    public Modem(String nameProvider, int delayDevice) {
        super(2);

    }

    @Override
    public String GetNameDevice() {
        return "Modem";
    }

    @Override
    public int GetDelayDevice() {
        return 1000;
    }
}
