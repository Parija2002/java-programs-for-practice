//pure abstraction and multiple inheritance in java can be achieved by interface

interface animal
{
    void walk();
}

class horse implements animal
{
    public void walk()
    {
        System.out.println("I am horse.");
    }
}

public class pureabstraction 
{
    public static void main(String[] args) 
    {
        horse h1=new horse();
        h1.walk();
    }
}
