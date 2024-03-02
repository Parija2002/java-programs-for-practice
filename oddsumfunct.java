import java.util.*;
public class oddsumfunct
{
    public static void oddnumsum(int n) 
    {
        int sum=0;
       for(int i=1;i<=n;i++)
       {
        if(i%2!=0)
        {
          sum=sum+i;      
        }
       }
       System.out.println("The sum of Numbers is:"+sum); 

    }
public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The last Number of series:");    
    int n=sc.nextInt(); 
    oddnumsum(n);
}
    
}
