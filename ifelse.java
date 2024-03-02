import java.util.*;
public class ifelse 
{
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Any Number:");
        int a=sc.nextInt();
        if(a%2==0)
        {
            System.out.println(a+" is Even");
        }
        else
        {
            System.out.println(a+" is odd");
        }
    } 
}