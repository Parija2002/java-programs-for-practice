import java.util.*;
public class spiralmatrix 
{
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Number of rows and columns:");
      int n=sc.nextInt();
      int m=sc.nextInt(); 

      int mat[][]=new int[n][m];
      for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            mat[i][j]=sc.nextInt();
        }
    }


    System.out.println("The Order of spiral matrix is: ");
    int rowstart=0;
    int rowend=n-1;
    int colstart=0;
    int colend=m-1;

    while (rowstart<=rowend&&colstart<=colend) 
    {


      for(int col=colstart;col<=colend;col++)
      {
        System.out.print(mat[rowstart][col]+" ");
      } 
      rowstart++;

      for(int row =rowstart;row<=rowend;row++)
      {
        System.out.print(mat[row][colend]+" ");
      }
      colend--;

      for (int col=colend;col>=colstart;col--)
      {
        System.out.print(mat[rowend][col]+" ");
      }
      rowend--;

      for(int row=rowend;row>=rowstart;row--)
      {
        System.out.print(mat[row][colstart]);
      }
      colstart++;
    }

    }
    
}
