import java.util.*;
public class arrsearch 
{
   public static void main(String[] args) 
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Size Of array:");
    int n=sc.nextInt();
    int num[]=new int[n];
    System.out.println("Enter Element:");
    for(int i=0;i<n;i++)
    {
        num[i]=sc.nextInt();
    }

    System.out.println("Enter Number To be Searched:");
    int x=sc.nextInt();
    for(int i=0;i<n;i++)
    {
        if(num[i]==x)
        {
            System.out.println("The Number Is at index: "+i);
        }
    }
   } 
}
