import java.util.*;
public class clearbitmanipulation 
{
   public static void main(String[] args) 
   {
    Scanner Sc =new Scanner(System.in);
    System.out.println("Enter Any number:");
    int no=Sc.nextInt();
    System.out.println("Enter Position:");
    int pos=Sc.nextInt();
    int bitmask=1<<pos;
    int notbitmask= ~(bitmask);
    int newno=notbitmask&no;
    System.out.println(newno);
   } 
}
