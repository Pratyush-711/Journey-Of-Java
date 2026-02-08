class AccessExample {

    private int privateVar = 10;
    int defaultVar = 20;           // default (package-private)
    protected int protectedVar = 30;
    public int publicVar = 40;

    private void privateMethod() {
        System.out.println("Private Method");
    }

    void defaultMethod() {
        System.out.println("Default Method");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    public void publicMethod() {
        System.out.println("Public Method");
    }

    // Public method to show private members inside same class
    public void showPrivateMembers() {
        System.out.println("Private Variable: " + privateVar);
        privateMethod();
    }
}

public class cwh_42_access_modifiers {

    public static void main(String[] args) {
        AccessExample obj = new AccessExample();

        // ❌ Not Accessible (Private)
        // System.out.println(obj.privateVar);
        // obj.privateMethod();

        // ✅ Accessible (Default)
        System.out.println("Default Variable: " + obj.defaultVar);
        obj.defaultMethod();

        // ✅ Accessible (Protected - Same Package)
        System.out.println("Protected Variable: " + obj.protectedVar);
        obj.protectedMethod();

        // ✅ Accessible (Public - Everywhere)
        System.out.println("Public Variable: " + obj.publicVar);
        obj.publicMethod();

        // Access private via public method
        obj.showPrivateMembers();
    }
}
