public class Router extends CommunicationDevice {

    private String Adress;
    private String Mask;
    private String gateway;

    public String getAdress() {
        return Adress;
    }

    public String getGateway() {
        return gateway;
    }

    public String getMask() {
        return Mask;
    }

    public Router(String Address, String Mask, String Gateway) {
        super(100);
        this.Adress = Address;
        this.Mask = Mask;
        this.gateway = Gateway;
    }

    @Override
    public String GetNameDevice() {
        return "Router";
    }

    @Override
    public int GetDelayDevice() {
        return 100;
    }
}
