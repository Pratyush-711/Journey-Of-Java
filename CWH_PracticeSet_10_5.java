class Base1 {
    Base1() {

        System.out.println("Base Constructor");
    }
}

class Derived1 extends Base1 {
    Derived1() {

        System.out.println("Derived1 Constructor");
    }
}

class Derived2 extends Derived1 {
    Derived2() {

        System.out.println("Derived2 Constructor");
    }
}

public class CWH_PracticeSet_10_5 {

    public static void main(String[] args) {

        Derived2 obj = new Derived2();
    }
}
