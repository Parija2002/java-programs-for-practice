import java.util.*;

public class guestcallingways 
{
    public static int guestcall(int n) 
    {
        if(n<=1)
        {
            return 1;
        }

        //for single guest
        int ways1=guestcall(n-1);

        //for guests in pair
        int ways2=(n-1) * guestcall(n-2);

        return ways1+ways2;
        
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of guest:");
        int n=sc.nextInt();
        System.out.println("No of ways of calling are:");
        System.out.println(guestcall(n));
    }
}
