import java.util.*;
public class arrsortrecur 
{
    public static boolean issorted(int arr[],int idx)
    {
        if(idx==arr.length-1)
        {
            return true;
        }

        if(arr[idx]<arr[idx+1])
        {
           return issorted(arr, idx+1);
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no of element in an array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter element:");
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
        }
        System.out.println(issorted(arr, 0));
    }
}
