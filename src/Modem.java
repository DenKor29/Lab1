public class Modem extends CommunicationDevice {
    public Modem(String protocol) {
        super(33600);
        this.protocol = protocol;
    }
    public String getProtocol() {
        return protocol;
    }

    private String protocol;

    @Override
    public String GetNameDevice() {
        return "Modem";
    }

    @Override
    public int GetDelayDevice() {
        return 1000;
    }
}
