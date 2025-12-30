public class CWH_12_string_methods {

    public static void main(String[] args) {
        String name = "Pratyush";

        // 1. length()
        System.out.println("1. Length: " + name.length());

        // 2. charAt()
        System.out.println("2. Character at index 2: " + name.charAt(2));

        // 3. toUpperCase()
        System.out.println("3. Uppercase: " + name.toUpperCase());

        // 4. toLowerCase()
        System.out.println("4. Lowercase: " + name.toLowerCase());

        // 5. equals()
        System.out.println("5. Equals 'Pratyush': " + name.equals("Pratyush"));

        // 6. equalsIgnoreCase()
        System.out.println("6. Equals Ignore Case 'pratyush': " + name.equalsIgnoreCase("pratyush"));

        // 7. contains()
        System.out.println("7. Contains 'aty': " + name.contains("aty"));

        // 8. startsWith()
        System.out.println("8. Starts with 'Pra': " + name.startsWith("Pra"));

        // 9. endsWith()
        System.out.println("9. Ends with 'ush': " + name.endsWith("ush"));

        // 10. indexOf()
        System.out.println("10. Index of 't': " + name.indexOf('t'));

        // 11. lastIndexOf()
        System.out.println("11. Last index of 'h': " + name.lastIndexOf('h'));

        // 12. substring()
        System.out.println("12. Substring (1 to 5): " + name.substring(1, 5));

        // 13. replace()
        System.out.println("13. Replace 'a' with 'o': " + name.replace('a', 'o'));

        // 14. concat()
        System.out.println("14. Concat: " + name.concat(" Manivansh"));

        // 15. trim()
        String spaced = "  Pratyush  ";
        System.out.println("15. Trim: '" + spaced.trim() + "'");

        // 16. isEmpty()
        String empty = "";
        System.out.println("16. Is Empty: " + empty.isEmpty());
    }
}

/*

1. length() – Returns the number of characters.

2. charAt(index) – Returns the character at given index.

3. toUpperCase() – Converts string to uppercase.

4. toLowerCase() – Converts string to lowercase.

5. equals() – Checks if two strings are exactly equal.

6. equalsIgnoreCase() – Checks equality ignoring case.

7. contains() – Checks if a string contains given text.

8. startsWith() – Checks if string starts with given value.

9. endsWith() – Checks if string ends with given value.

10. indexOf() – Returns first position of a character or string.

11. lastIndexOf() – Returns last position of a character.

12. substring() – Extracts part of a string.

13. replace() – Replaces characters or words.

14. concat() – Joins two strings.

15. trim() – Removes extra spaces from start and end.

16. isEmpty() – Checks if string is empty.

*/
