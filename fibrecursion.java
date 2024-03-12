import java.util.*;
public class fibrecursion 
{
    public static int printfib(int a,int b,int n) 
    {
      if(n==0)
      {
        return 1;
      }  
      int c=a+b;
      System.out.print(c+" ");
      printfib(b,c,n-1);
      return 1;

    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a=0;int b=1;
        System.out.println("Enter how many numbers will be printed:");
        int n=sc.nextInt();
        System.out.print(a+" ");
        System.out.print(b+" ");
        printfib(a,b,n-2);
                                                                                                              
       
    }
}
