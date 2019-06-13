public class Main {
    public static void main(String[] args) {
        CommunicationDevice communicationDevice = new CommunicationDevice(0);
        Comutator comutator = new Comutator("FFFFFFFFFFFF");
        Modem modem = new Modem("v.42bis");
        Router router = new Router("127.0.0.1","255.255.255.255","0.0.0.0");
    }
}
