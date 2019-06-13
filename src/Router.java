public class Router extends CommunicationDevice {

    private String IpAdress;

    public Router(String nameProvider, int delayDevice) {
        super(3);

    }
    public String getIpAdress() {
        return IpAdress;
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
