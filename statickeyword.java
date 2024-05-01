import java.util.*;
class department
{
    int did;
    static String deptname="AIDS";

    public void getid()
    {
        System.out.println("Enter Department Id:");
        Scanner sc=new Scanner(System.in);
        did=sc.nextInt();    
    }

    public void printid()
    {
        System.out.println("ID:"+did);
    }
}

public class statickeyword 
{
    public static void main(String[] args) 
    {

        department d1=new department();
        d1.getid();
        d1.printid();
        System.out.println("Department:"+department.deptname);


    }
}
