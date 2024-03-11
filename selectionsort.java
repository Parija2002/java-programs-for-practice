import java.util.*;
public class selectionsort 
{

    public static int printarray(int arr[]) 
    {
        System.out.println("No After sorting are:");
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
        System.out.println("Enter no of element:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter no to be Sorted:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length-1;i++)
        {
            int smallest=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[smallest]>arr[j])
                {
                    smallest=j;
                }

            }
            int temp=arr[smallest];
                arr[smallest]=arr[i];
                arr[i]=temp;
        }
        printarray(arr);

   } 
}
