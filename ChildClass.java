package package2;

import package1.ParentClass;

public class ChildClass extends ParentClass {

    public void show() {

        // ❌ Not Accessible (Default - Different Package)
        // System.out.println(defaultVar);

        // ✅ Accessible (Protected - Through Inheritance)
        System.out.println("Protected Variable: " + protectedVar);
    }

    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.show();
    }
}
