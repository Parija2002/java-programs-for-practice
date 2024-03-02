public class butterflypattern 
{
  public static void main(String[] args) 
  {
    int n=5;
    //All code is as it is ,only logic for spaces and lower-upper part
    //upper part
    for(int i=1;i<=n;i++)
    {
        //1st part
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }

        //spaces   
        int spaces=2*(n-i);  // ()compulsory for spaces
        for(int j=1;j<=spaces;j++)
        {
            System.out.print(" ");
        }

        //2nd part
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }

    //lower part
    for(int i=n;i>=1;i--)
    {
        //1st part
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }

        //spaces   
        int spaces=2*(n-i);  // ()compulsory for spaces
        for(int j=1;j<=spaces;j++)
        {
            System.out.print(" ");
        }

        //2nd part
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
  }  
}
