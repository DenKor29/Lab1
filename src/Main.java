import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        CommunicationDevice communicationDevice = new CommunicationDevice(0);
        Comutator comutator = new Comutator("FFFFFFFFFFFF");
        Modem modem = new Modem("v.42bis");
        Router router = new Router("127.0.0.1","255.255.255.255","0.0.0.0");

        ArrayList <CommunicationDevice> communicationDevices = new ArrayList <CommunicationDevice>();
        communicationDevices.add(communicationDevice);
        communicationDevices.add(modem);
        communicationDevices.add(router);
        communicationDevices.add(comutator);

        for(int i=0;i<communicationDevices.size();i++){
            String name = communicationDevices.get(i).GetNameDevice();
            int delay = communicationDevices.get(i).GetDelayDevice();
            System.out.println("Name Device = " + name +" Delay ="+delay);
        }

        System.out.println("Speed  Device = " + communicationDevice.getSpeed());
        System.out.println("Mac  Device = " + comutator.getMacAddress());
        System.out.println("IP  Device = " + router.getAdress());
        System.out.println("Protocol  Device = " + modem.getProtocol());

    }
}
