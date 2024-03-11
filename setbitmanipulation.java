import java.util.*;
public class setbitmanipulation 
{
   public static void main(String[] args) 
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Any Number:");
    int no=sc.nextInt();
    System.out.println("Enter position:");
    int pos=sc.nextInt();
    int bitmask=1<<pos;
    int newno=bitmask | no;
    System.out.println(newno);
   } 
}
