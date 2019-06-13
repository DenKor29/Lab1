public class Comutator extends CommunicationDevice {
    public Comutator(String nameProvider, int delayDevice) {
        super(2);
    }
    @Override
    public String GetNameDevice() {
        return "Comutator";
    }

    @Override
    public int GetDelayDevice() {
        return 10;
    }
}
