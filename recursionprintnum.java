import java.util.*;
public class recursionprintnum 
{
    public static void printnum(int n) 
    {
       if(n==0)
       {
        return ;
       }
       System.out.print(n+" ");
       printnum(n-1); 
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter last number of series:");
        int n=sc.nextInt();
        printnum(n);

    }

}
