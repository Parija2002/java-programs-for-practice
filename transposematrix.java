import java.util.*;


public class transposematrix {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter no of rows and column:");
      int n = sc.nextInt();
      int m = sc.nextInt();


      int matrix[][] = new int[n][m];
      System.out.println("Enter element in matrix:");
      for(int i=0; i<n; i++) {
           for(int j=0; j<m; j++) {
               matrix[i][j] = sc.nextInt();
           }
      }

      //original matrix
      System.out.println("Original matrix is:");
      for(int i=0; i<n; i++) {
        for(int j=0; j<m; j++) {
            System.out.print(matrix[i][j]+" ");
        }
   }
      




      System.out.println("The transpose is : ");
      //To print transpose
      for(int j=0; j<m ;j++) {
          for(int i=0; i<n; i++) {
              System.out.print(matrix[i][j]+" ");
          }
          System.out.println();
      }
   }
}
