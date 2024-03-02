import java.util.*;
public class fibonaci 
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int f1=0,f2=1,f3;
    System.out.println("Enter how many number will be printed:");
    int n=sc.nextInt();
    System.out.println("Fibonacci Series Will be:");

    for(int i=1;i<=n;i++)
    {   
        System.out.println(f1);
        f3=f1+f2;
        f1=f2;
        f2=f3;

    }

  }  
}
