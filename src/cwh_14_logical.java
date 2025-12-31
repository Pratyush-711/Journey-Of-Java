public class cwh_14_logical {

    public static void main(String[] args) {
        System.out.println("For Logical AND...");
        boolean a = true;
        boolean b = false;
        boolean c = true;
        if (a && b && c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println("For Logical OR...");
        boolean a1 = true;
        boolean b1 = false;
        if (a1 || b1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println("For Logical OR...");
        boolean a2 = true;
        if (!a2) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}
