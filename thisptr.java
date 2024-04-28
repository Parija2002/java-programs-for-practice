import java.util.*;

class student
{
    String name;
    int age;

    public  void readinfo() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name And Age:");
        name=sc.next();
        age=sc.nextInt();
    }

    public void printInfo()
    {
        System.out.println("Name And Age Are as follows:");
        System.out.println("Name:"+this.name);
        System.out.println("Age:"+this.age);
    }
}


public class thisptr 

{
    public static void main(String[] args) 
    {
        student c1=new student();
        c1.readinfo();
        c1.printInfo();
        student c2=new student();
        c2.readinfo();
        c2.printInfo();

        
    }    
}

