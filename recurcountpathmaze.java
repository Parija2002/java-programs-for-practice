import java.util.*;
public class recurcountpathmaze 
{
    //total path =right moves path+downward path
    //No left,upward,diagonal path will be calculated

    public static int countpath( int i,int j,int n,int m) 
    {
        if(i==n || j==m)
        {
            return 0;
        }
        if(i==n-1 && j==m-1)
        {
            return 1;
        }

        //moves down
        int downpaths=countpath(i+1, j, n, m);
    
        //move right
        int rightpaths=countpath(i, j+1, n, m);

        return downpaths+rightpaths;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Rows And Columns:");
        int row=sc.nextInt();
        int column=sc.nextInt();
        System.err.println("Total no. of paths are:");
       int totalpaths=countpath(0, 0, row, column);
       System.out.println(totalpaths);


    }
    
}
