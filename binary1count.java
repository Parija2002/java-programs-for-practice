
import java.util.*;

class CountSetBits {
    // Function to count set bits in the binary representation of a positive integer n
    static int countSetBits(int n) {
        int count = 0;
        // Loop until all bits are processed
        while (n > 0) {
            // Check if the least significant bit is set (1)
            // If it is, increment the count
            count += n & 1;
            // Right shift the number by 1 bit to process the next bit
            n >>= 1;
        }
        // Return the total count of set bits
        return count;
    }

    // Driver program
    public static void main(String args[]) {
        // Example usage
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number:");
        int i = sc.nextInt(); // Binary representation: 1001
        System.out.println("Number of set bits in " + i + " is: " + countSetBits(i)); // Output: 2
    }
}
