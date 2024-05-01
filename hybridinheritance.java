import java.util.Scanner;

// Base class
class Person 
{
    String name;

    public void getName() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
    }

    public void display() 
    {
        System.out.println("Name: " + name);
    }
}

// Interface for Employee details
interface Employee 
{
    int employeeId = 0;

    void getEmployeeDetails();

    void displayEmployeeDetails();
}

// Derived class inheriting from Person and implementing Employee interface
class EmployeeDetails extends Person implements Employee 
{
    int employeeId;

    @Override
    public void getEmployeeDetails() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee ID: ");
        employeeId = scanner.nextInt();
        getName(); // Inherited method from Person class
    }

    @Override
    public void displayEmployeeDetails() 
    {
        System.out.println("Employee ID: " + employeeId);
        display(); // Inherited method from Person class
    }
}

// Another derived class inheriting from EmployeeDetails
class Manager extends EmployeeDetails 
{
    String department;

    public void getManagerDetails() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter department: ");
        department = scanner.nextLine();
        getEmployeeDetails(); // Inherited method from EmployeeDetails
    }

    public void displayManagerDetails() 
    {
        System.out.println("Department: " + department);
        displayEmployeeDetails(); // Inherited method from EmployeeDetails
    }
}

public class hybridinheritance 
{
    public static void main(String[] args) 
    {
        Manager manager = new Manager();
        manager.getManagerDetails();
        manager.displayManagerDetails();
    }
}
