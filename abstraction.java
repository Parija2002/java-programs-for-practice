abstract class animal
{
    abstract void walk(); 
}

class horse extends animal
{
    public void walk()
    {
        System.out.println("I am Horse");
    }
}

class crow extends animal
{
    public void walk()
    {
        System.out.println("I am crow");
    }
}


public class abstraction 
{
    public static void main(String[] args) 
    {
        horse h1=new horse();
        h1.walk();
        crow c1=new crow();
        c1.walk();
    }
}
