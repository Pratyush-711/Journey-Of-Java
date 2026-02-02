interface TVRemote {
    void powerOn();
    void powerOff();
}

interface SmartTVRemote extends TVRemote {
    void openYoutube();
    void openNetflix();
}

class TV implements TVRemote {

    @Override
    public void powerOn() {
        System.out.println("TV is powering on...");
    }

    public void powerOff() {
        System.out.println("TV is powering off...");
    }
}

public class CWH_PracticeSet_11_4 {

    public static void main(String[] args) {
        TVRemote remote = new TV();

        remote.powerOn();
        remote.powerOff();

        // remote.openYoutube(); --> Not allowed
    }
}
