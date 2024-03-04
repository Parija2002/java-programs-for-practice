import java.util.*;
public class arrayofstring 
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int n=sc.nextInt();
    String str[]=new String[n];
    int totallength=0;
    System.out.println("Enter the element in array:");
    for(int i=0;i<n;i++)
    {
        str[i]=sc.next();
        totallength=totallength+str[i].length();  //calculates the total length of array of string
    }

    System.out.println("The total length of array of string is:"+totallength);
    
  }  
}
