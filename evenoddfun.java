
import java.util.*;

public class evenoddfun {

    public static void evenodd(int n) {
        if (n % 2 == 0) {
            System.out.println("Even");

        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no :");
        int n = sc.nextInt();
        evenodd(n);
    }
}
