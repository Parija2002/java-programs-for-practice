import java.util.*;
public class loop 
{
    public static void main(String[] args)
     {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Any Number:");
        int n=sc.nextInt();
        //for(int i=1;i<=10;i++)
        //{
        //    System.out.println(n*i);
        //}

            int i=1;
           // while(i<=10)
            //{
              //  System.out.println(n*i);
                //i++;
            //}


            do{
                System.out.println(n*i);
                i++;
            }while(i<=10);


        

    }
}
