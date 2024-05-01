abstract class animal
{
    animal()
    {
        System.out.println("I am Constructor in abstract class");
    }
}

class horse extends animal
{

    horse() 
    {
        System.out.println("I am in class");
    }
}


public class abstractconstructor 
{
    public static void main(String[] args) 
    {
        horse h1=new horse();
    }
}
