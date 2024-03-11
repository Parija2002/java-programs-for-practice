import java.util.*;
public class bubblesort 
{   

    public static int printarray(int arr[])
    {
       for(int i=0;i<arr.length;i++)
       {
       System.out.print(arr[i]+" ");
       }
       System.out.println();
       return 1;
   }
   
   //time complexity=o(n^2)

    public static void main(String[] args) 
    {
       Scanner sc =new Scanner (System.in);
       System.out.println("Enter no of element:");
       int n=sc.nextInt();
       int arr[]=new int[n]; 
        //for input
       System.out.println("Enter Array element:");
       for(int i=0;i<n;i++)
       {
        arr[i]=sc.nextInt();
       }

       //sorting

       for(int i=0;i<arr.length-1;i++)
       {
        for(int j=0;j<arr.length-i-1;j++)
        {   
            if(arr[j]>arr[j+1])
            {
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            }
        }
       }
    
printarray(arr);
   
}
}
