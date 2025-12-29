public class CWH_PracticeSet_02_2 {

    public static void main(String[] args) {
        char grade = 'A';

        // Encrypt: add 8 to the grade
        char encryptGrade = (char) (grade + 8);

        // Decrypt: subtract 8 from encrypted grade
        char decryptGrade = (char) (encryptGrade - 8);

        System.out.println("Original Grade: " +grade);
        System.out.println("Encrypted Grade: " +encryptGrade);
        System.out.println("Decrypted Grade: " +decryptGrade);
    }
}
