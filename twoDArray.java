import java.util.*;
public class twoDArray 
{
   public static void main(String[] args) 
   {
    Scanner sc=new Scanner(System.in);
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
System.out.println("The 2-D Array will be:");
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<column;j++)
        {
            System.out.print(twodarr[i][j]+" ");
        }
        System.out.println();

    }
   } 
}
