abstract class Telephone {
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends Telephone {

    @Override
    void ring() {
        System.out.println("SmartTelephone is ringing...");
    }

    void lift() {
        System.out.println("Call connected");
    }

    void disconnect() {
        System.out.println("Call disconnected");
    }

    void browseInternet() {
        System.out.println("Browsing internet...");
    }
}

public class CWH_PracticeSet_11_3 {

    public static void main(String[] args) {
        Telephone phone = new SmartTelephone();

        phone.ring();
        phone.lift();
        phone.disconnect();

        // phone.browseInternet(); --> Not allowed
    }
}
