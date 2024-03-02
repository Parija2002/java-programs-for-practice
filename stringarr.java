import java.util.*;
public class stringarr 
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Size of Array: ");
    int n=sc.nextInt();
    String arr[]=new String[n];
    System.out.println("Enter String Input:");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.next();
    }
    System.out.println("Array elements are:");
    for(int i=0;i<n;i++)
    {
        System.out.println("name " + (i+1) +" is : " + arr[i]);
    }
  }  
}
