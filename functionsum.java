import java.util.*;
public class functionsum
{

  public static int function1(int a,int b)
  {
     int c =a+b; 
     return c;
  }

    public static void main(String[] args) 
    {
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter two numbers:");
      int a=sc.nextInt();
      int b=sc.nextInt(); 
      int sum=function1(a,b);
      System.out.println("The sum is :"+sum);
    }

    
}
