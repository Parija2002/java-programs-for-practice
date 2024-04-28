
import java.util.*;

class dept
{
    int id;
    String name;

    dept() //default constructor
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Id and Name Of Dept:");
        id=sc.nextInt();
        name=sc.next();
    }

    public void printInfo()
    {
        System.out.println("Id And Name are as Follows:");
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);

    }

}


public class defaultconstructor 
{
    public static void main(String[] args) 
    {
        dept d1=new dept(); //constructor called
        d1.printInfo();
    }
}
