import java.util.*;
public class multiplyfunct 
{

    public static int multiply(int a,int b)
    {
       int mul=a*b;
       return mul; 
    }
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in) ;
       System.out.println("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Multiplication is:"+multiply(a,b));
    }

}
