import java.util.Scanner;

public class recurplacetilesonfloor 
{
    public static int placetiles(int n,int m) 
    {
        if(n==m)
        {
            return 2;
        }
        if(n<m)
        {
            return 1;
        }

        int vertplace=placetiles(n-m, m);
        int horiplace=placetiles(n-1,m);

        return vertplace+horiplace;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter No of rows and columns:");
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.err.println("No. of placements are: ");
        System.out.println(placetiles(n, m));
    }
    
}
