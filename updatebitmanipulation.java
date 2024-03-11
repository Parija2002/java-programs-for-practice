import java.util.*;
public class updatebitmanipulation 
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Any No:");
    int no=sc.nextInt();
    System.out.println("Enter pos:");
    int pos=sc.nextInt();
    System.out.println("Enter bit for updation:");//either 0 or 1 if bit=0 then clear and bit =1 then set
    int bit =sc.nextInt();
    int bitmask=1<<pos;

    if(bit==1)
    {
        int newno=bitmask | no;
        System.out.println("Number After updated bit to 1 is:"+newno);
    }
    else if(bit==0)
    {
        int notbitmask=~bitmask;
        int newno=notbitmask&no;
        System.out.println("Number after updated bit to 0 is:"+newno);
    }
    else
    {
        System.out.println("Enter valid bit");
    }
       
  }  
}
