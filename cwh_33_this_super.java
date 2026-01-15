class EkClass {
    int a;

    public int getA() {
        return a;
    }

    EkClass(int a) {
        this.a = a;
    }
    public int returnone() {
        return 1;
    }
}
class DoClass extends EkClass {
    DoClass(int c) {
        super(c);
        System.out.println("I Am A Constructor");
    }
}
public class cwh_33_this_super {

    public static void main(String[] args) {
        EkClass ec = new EkClass(65);
        DoClass dc = new DoClass(20);
        System.out.println(ec.getA());
    }
}
