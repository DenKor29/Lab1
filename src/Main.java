public class Main {
    public static void main(String[] args) {
        CommunicationDevice communicationDevice = new CommunicationDevice(0);
        Comutator comutator = new Comutator("Comutator",100);
        Modem modem = new Modem("Modem",1000);
        Router router = new Router("Router",1000);
    }
}
