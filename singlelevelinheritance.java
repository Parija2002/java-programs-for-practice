import java.util.*;

class dept
{
    int deptid;
    String deptname;

    public void getInfod()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Dept id and Name:");
        deptid=sc.nextInt();
        deptname=sc.next();
    }

    public void printInfod()
    {
        System.out.println("Dept Details are as follows:");
        System.out.println("DeptID:"+deptid+"\n"+"DeptName:"+deptname);
    }
}

class student extends dept
{
    int Srollno;
    String Sname;

    
    public void getInfos()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Students Rollno and name:");
        Srollno=sc.nextInt();
        Sname=sc.next();
    }


    public void printInfos()
    {
        System.out.println("Students Details are as follows:");
        System.out.println("RollNo:"+Srollno+"\n"+""+Sname);
    }
}

public class singlelevelinheritance 
{
    public static void main(String[] args) 
    {
        student s1=new student();
        s1.getInfod();
        s1.printInfod();
        s1.getInfos();
        s1.printInfos();
    }
}
