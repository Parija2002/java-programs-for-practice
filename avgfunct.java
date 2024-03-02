import java.util.*;
public class avgfunct 
{

    public static int average(int a,int b,int c)
    {
      int avg =(a+b+c)/3;
      System.out.println("The average is:"+avg);
      return 0; 
      
    }
   public static void main(String[] args) 
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any three Numbers:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();

    average(a,b,c);

   } 
}
