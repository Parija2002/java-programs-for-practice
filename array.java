import java.util.*;
public class array 
{
  public static void main(String[] args) 
  {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter The Size Of Array:");
    int n=sc.nextInt();
    int arr[]=new int[n];

    System.out.println("Enter number of array:");
    //input
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println("Array elements are:");
    //output
    for(int i=0;i<n;i++)
    {
        System.out.println(arr[i]);

    }

  }  
}
