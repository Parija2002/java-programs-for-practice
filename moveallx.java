import java.util.*;

public class moveallx {
    public static void moveAllXToEnd(String str, int idx, int count, String newString) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == 'x') 
        {
            count++;
            moveAllXToEnd(str, idx + 1, count, newString);
    }
        
        else
        {
            newString+=currChar;
            moveAllXToEnd(str, idx+1, count, newString);
        }
        // Recursively call the method with incremented index
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String Containing Character 'X': ");
        String str = sc.next();
        System.out.print("String After Moving All X to end :");
        moveAllXToEnd(str, 0, 0, "");
    }
}
