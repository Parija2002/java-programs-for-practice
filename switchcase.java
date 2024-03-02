import java.util.*;
public class switchcase
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        System.out.println("Enter Your Choice: ");
        int ch=sc.nextInt();
        System.out.println("Enter value of a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();            
                    
        switch(ch)
        {
            case 1: 
                    int c=a+b;
                    System.out.println("Addition is:"+c);
                    break;
            case 2: 
                    int d=a-b;
                    System.out.println("Subtraction is:"+d);
                    break;
            case 3: 
                    int e=a*b;
                    System.out.println("Multiplication is:"+e);
                    break;    
            case 4: 
                    int f=a/b;
                    System.out.println("Division is:"+f);
                    break; 
            default:
                    System.out.println("Enter valid Choice ");   
                    break;
        }

    }
}