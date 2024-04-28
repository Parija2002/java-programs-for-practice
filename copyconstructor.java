
import java.util.*;

class dept
{
    int id;
    String name;

    dept(dept d2) //    copy constructor
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Id and Name Of Dept:");
        this.id=sc.nextInt();
        this.name=sc.next();
    }

    public void printInfo()
    {
        System.out.println("Id And Name are as Follows:");
        System.out.println("ID: "+this.id);
        System.out.println("Name: "+this.name);

    }

    dept()
    {

    }

}


public class copyconstructor 
{
    public static void main(String[] args) 
    {
        dept d1=new dept(); //constructor called
        dept d2=new dept(d1);
        d2.printInfo();
    }
}
