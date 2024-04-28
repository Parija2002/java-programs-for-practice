import java.util.*;

class dept 
{
    int id;
    String name;

    dept(int id, String name) 
    {
        this.id = id;
        this.name = name;
    }
    

    public void display() 
    {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
    }
}

public class paramconst 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Id and Name Of Dept:");
        int id = sc.nextInt();
        String name = sc.next();
        dept d1 = new dept(id, name);
        d1.display(); // To display the details of the department
    }
}
