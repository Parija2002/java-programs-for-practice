import java.util.*;
public class getbitbitmanipulation 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number:");
        int no=sc.nextInt();
        System.out.println("Enter Position:");
        int pos=sc.nextInt();
        int bitmask=1<<pos;
        
        if((bitmask&no)==0)
        {
            System.out.println("bit is zero");
        }
        else{
            System.out.println("Bit is 1");
        }


    }
}
