public class Comutator extends CommunicationDevice {
    public Comutator(String MacAddress) {
        super(10000);
        this.MacAddress = MacAddress;
    }
    private String MacAddress;
    @Override
    public String GetNameDevice() {
        return "Comutator";
    }

    @Override
    public int GetDelayDevice() {
        return 10;
    }
}
