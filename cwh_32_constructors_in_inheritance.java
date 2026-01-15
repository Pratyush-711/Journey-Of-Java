class Base {
    Base() {
        System.out.println("I am a constructor");
    }
    Base(int a) {
        System.out.println("I am an overloaded constructor with value of a as: " + a);
    }
    public int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
}

class Derived extends Base {
    Derived() {
//        super(0);
        System.out.println("I am a derived class constructor");
    }
    Derived(int a, int b) {
        super(a);
        System.out.println("I am an overloaded derived constructor with value of a as: " + a + " and b as: " + b);
    }
    public int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}

class ChildOfDerived extends Derived {
    ChildOfDerived() {
        System.out.println("I am a child of derived class constructor");
    }
    ChildOfDerived(int a, int b, int c) {
        super(a, b);
        System.out.println("I am an overloaded derived constructor with value of c as: " + c);
    }
}
public class cwh_32_constructors_in_inheritance {

    public static void main(String[] args) {
        // Base b = new Base();
//      // Derived d = new Derived(14, 9);
        ChildOfDerived cd = new ChildOfDerived(12, 13, 15);
    }
}
