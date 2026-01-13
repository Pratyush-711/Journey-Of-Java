class CellPhone {
    public void ring() {
        System.out.println("Ringing...");
    }
    public void vibrate() {
        System.out.println("Vibrating...");
    }
    public void callFriend() {
        System.out.println("Calling Mukul...");
    }
}
public class CWH_PracticeSet_08_2 {

    public static void main(String[] args) {
        CellPhone vivo = new CellPhone();
        vivo.callFriend();
        vivo.vibrate();
        vivo.ring();
    }
}
