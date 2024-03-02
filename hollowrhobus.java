public class hollowrhobus 
{
   public static void main(String[] args) 
   {
    int n=5,m=4;
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=5-i;j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=m;j++)
        {
            if(i==1||j==1||i==n||j==m)
            {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
   } 
}
