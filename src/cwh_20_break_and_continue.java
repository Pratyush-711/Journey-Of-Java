public class cwh_20_break_and_continue {

    public static void main(String[] args) {
        // Break and Continue using loops!
           // Break Statement
        System.out.println("Break Statement");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println("Java is Great!");
            if(i==2){
                System.out.println("Ending the loop");
                break;
            }
        }
           // Continue Statement
        System.out.println("Continue Statement");

        for (int j = 2; j <= 20; j += 2) {

            if (j == 10) {
                continue;   // skip printing 10
            }

            System.out.println(j);
        }
    }
}
