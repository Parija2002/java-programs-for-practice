import java.util.*;
public class factfun 
{

  public static void fact(int n) 
  {
    if(n<0)
    {
        System.out.println("Invalid");
        return;
    }

    int fact=1;  //initialize fact=1 not zero 
    for (int i=n;i>=1;i--)
    {
         fact= fact*i;
    }
    System.out.println("Factorial of No is:"+fact);
  }  
  public static void main(String[] args) 
  {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter no to calculate Factorial:");
    int n=sc.nextInt();

    fact(n);

  }  
}
