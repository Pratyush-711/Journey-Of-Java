interface MyCamera {
    void takeSnap();
    void recordVideo();
    private void greet() {
        System.out.println("Good Morning!");
    }
    default void record4kVideo() {
        greet();
        System.out.println("Recording in 4K...");
    }
}

interface MyWifi {
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting...");
    }
}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera {

    public void takeSnap() {
        System.out.println("Taking Snap");
    }

    public void recordVideo() {
        System.out.println("Recording Video");
    }

    public String[] getNetworks() {
        System.out.println("Getting List of Networks");
        String[] networkList = {"Harry", "Prashanth", "Anjali5G"};
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}

public class cwh_38_default_methods {

    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        String[] ar = ms.getNetworks();

        for (String item : ar) {
            System.out.println(item);
        }
        ms.record4kVideo();
    }
}
