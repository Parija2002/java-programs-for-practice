import java.util.*;
public class circum 
{
    public static void circumference(int r)
    {
        double cir=2*3.14*r;
        System.out.println("Circumference Is:"+cir);
        
    }
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Radius Of A circle:");
       int r=sc.nextInt();
       circumference(r);

    }
}
