public class CWH_PracticeSet_03_3 {

    public static void main(String[] args) {

        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Pratyush");
        System.out.println(letter);
    }
}
