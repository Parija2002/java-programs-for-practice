import java.util.*;
public class insertionsort 
{
    //printing sorted array
    public static int printarray(int arr[]) 
    {   System.out.println("Sorted Array is:");
       for(int i=0;i<arr.length;i++)
       {
        System.out.print(arr[i]+" ");
       } 
       System.out.println();
       return 1;
    }
   public static void main(String[] args) 
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter No of Element:");
    int n=sc.nextInt();
    int arr[] =new int[n];
    System.out.println("Enter Element to sort:");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
//insertion sort

    for(int i=0;i<arr.length;i++)
    {
        int current =arr[i];
        int j=i-1;
        while(j>=0&&current <arr[j])
        {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=current ;
    }
    printarray(arr);//function calling
    
   } 
}
