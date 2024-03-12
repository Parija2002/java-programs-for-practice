import java.util.*;
public class calcfacturecursion 
{

    public static int calfact(int n) 
    {
       if(n==0||n==1)
       {
        return 1;
       }
       int factnum1=calfact(n-1);
       int fact=n*factnum1;
       return fact ; 
    }
   public static void main(String[] args) 
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Number to calculate factorial:");
    int n=sc.nextInt();
    int ans=calfact(n);
    System.out.println("Factorial of "+n +" is :"+ans);
   } 
}
