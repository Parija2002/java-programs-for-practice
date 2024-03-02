import java.util.*;
public class nestedelse
{
   public static void main(String[] args)
    {
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter Value of a");
       int a=sc.nextInt();
       System.out.println("Enter Value of b");
       int b=sc.nextInt();

       if(a==b)
       {
        System.out.println("Equal");
       }
       else
       {
        if (a>b){
            System.out.println(a+" is greater");
        }
        else
        {
            System.out.println(b+" is greater");
        }
       }


   } 
}
