import java.util.*;
public class twodsrchno 
{
   public static void main(String[] args)
 {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the no of rows and column: ");
    int row=sc.nextInt();
    int column=sc.nextInt();
    int twodarr[][]=new int[row][column];

    System.out.println("enter element:");
    //input
    //rows
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<column;j++)
        {
            twodarr[i][j]=sc.nextInt();
        }
    }
    System.out.println("Enter no to be searched:");
    int x=sc.nextInt();
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<column;j++)
        {
            if(twodarr[i][j]==x)
            {
                System.out.println("The number is found at location:("+i+","+j+")");
            }
        }
    }
   } 
}
