public class cwh_25_method_overloading {

    static void foo() {
        System.out.println("Good Morning bro!");
    }

    static void foo(int a) {
        System.out.println("Good morning " + a + " bro!");
    }

    static void foo(int a, int b){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }

    static void change(int a) {
        a = 98;
    }

    static void change2(int [] arr) {
        arr[0] = 98;
    }

    static void tellJokes() {
        System.out.println("I told my computer I needed a break...\n" + "It said: No problem - I'll go to sleep.");
    }

    public static void main(String[] args) {
        // tellJokes();
        // Case - 1: Changing the Integer
//        int x = 45;
//        change(x);
//        System.out.println("The value of x after running change is:- " +x);

        // Case - 2: Changing the Array
//        int [] marks = {52, 73, 77, 89, 98, 94};
//        change2(marks);
//        System.out.println("The value of marks[0] after running change is:- " +marks[0]);

        // Method Overloading
        foo();
        foo(3000);
        foo(100 , 200);
        // Arguments are actual!
    }
}
