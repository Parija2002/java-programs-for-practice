import java.util.*;
public class ispoweroftwo 
{
        /* Function to check if x is power of 2*/
        static boolean isPowerOfTwo(int n)
        {
            if (n == 0)
                return false;
     
            return (int)(Math.ceil((Math.log(n) / Math.log(2))))
                == (int)(Math.floor(
                    ((Math.log(n) / Math.log(2)))));
        }
   public static void main(String[] args) 
   {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter Any number:");
    int n=sc.nextInt();
    if(isPowerOfTwo(n))
    {
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }
   } 
}
