import java.util.*;
public class polymorphismfunctionoverloading
{
    String name;
    int rollno;

    public void printInfo(String name)
    {
        System.out.println(name);
    }

    public void printInfo(int rollno)
    {
        System.out.println(rollno);
    }

    public void printInfo(String name,int rollno)
    {
        System.out.println("Name:"+name+"\n"+"Rollno:"+rollno);
    }
}


class polymorphism
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name And Rollno: ");
        String name=sc.next();
        int rollno=sc.nextInt();
        polymorphismfunctionoverloading p1=new polymorphismfunctionoverloading();
        p1.printInfo(name, rollno);

    }
}

