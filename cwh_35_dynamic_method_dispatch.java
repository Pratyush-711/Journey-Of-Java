class Phone {
    public void greet() {
        System.out.println("Good Morning!");
    }
    public void name() {
        System.out.println("My name is Java");
    }
}
class SmartPhone extends Phone {
    public void swagat() {
        System.out.println("Aapka swagat hai");
    }
    public void name() {
        System.out.println("My name is Java in Class two");
    }
}
public class cwh_35_dynamic_method_dispatch {

    public static void main(String[] args) {
      Phone obj = new Phone();
      obj.name();
      obj.greet();
      SmartPhone obj1 = new SmartPhone();
      obj1.name();
      obj1.swagat();
    }
}
