import java.util.*;

public class keypadcombination {

    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno",
            "pqr", "stu", "vwx", "yz"};

    public static void printComb(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.print(combination);
            return;
        }

        char currChar = str.charAt(idx);
        int digit = currChar - '0'; // Convert char to integer representing keypad digit
        String mapping = keypad[digit];

        for (int i = 0; i < mapping.length(); i++) {
            printComb(str, idx + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any key combination:");
        String str = sc.next();
        System.out.println("Your key combination is:");
        printComb(str, 0, "");
        sc.close(); // 
    }
}
