class Phone {
    public void showTime() {
        System.out.println("Time is 8 AM");
    }
    public void on() {
        System.out.println("Turning on Phone...");
    }
}
class SmartPhone extends Phone {
    public void music() {
        System.out.println("Playing music...");
    }
    public void off() {
        System.out.println("Turning on SmartPhone...");
    }
}
public class cwh_35_dynamic_method_dispatch {

    public static void main(String[] args) {
//      Phone obj = new Phone(); // Allowed
//      obj.name();
//      obj.greet();
//      SmartPhone obj1 = new SmartPhone(); // Allowed
//      obj1.name();
//      obj1.swagat();
        Phone obj = new SmartPhone(); // It's allowed
//        SmartPhone obj1 = new Phone(); // It's not allowed
        obj.showTime();
        obj.on();

        // obj.music(); --> Not Allowed
    }
}
