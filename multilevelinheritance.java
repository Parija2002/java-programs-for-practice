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
        System.out.println("RollNo:"+Srollno+"\n"+"Name:"+Sname);
    }
}

class teacher extends student
{
    int tid;
    String Sname;
    String desg;

    
    public void getInfot()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter teachers id,name and desg:");
        tid=sc.nextInt();
        Sname=sc.next();
        desg=sc.next();
    }


    public void printInfot()
    {
        System.out.println("Teacher's Details are as follows:");
        System.out.println("ID:"+tid+"\n"+"Name:"+Sname+"\n"+"Designation:"+desg);
    }
}


public class multilevelinheritance 
{
    public static void main(String[] args) 
    {
        teacher s1=new teacher();
        s1.getInfod();
        s1.printInfod();
        s1.getInfos();
        s1.printInfos();
        s1.getInfot();
        s1.printInfot();
    }
}
