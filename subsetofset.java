import java.util.*;

public class subsetofset {

    public static void printsubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findsubset(int n, ArrayList<Integer> set, ArrayList<Integer> subset) {
        if (n == 0) {
            printsubset(subset);
            return;
        }

        // Include the nth element in the subset
        subset.add(set.get(n - 1));
        findsubset(n - 1, set, subset);

        // Exclude the nth element from the subset
        subset.remove(subset.size() - 1);
        findsubset(n - 1, set, subset);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of elements in set:");
        int n = sc.nextInt();

        ArrayList<Integer> set = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        ArrayList<Integer> subset = new ArrayList<>();
        findsubset(n, set, subset);
    }
}
