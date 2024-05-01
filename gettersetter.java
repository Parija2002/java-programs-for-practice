class account 
{
    public String name;
    protected String email;
    private String pwd;


    //getter&setter method for accessing private element

    public String getpassword()
    {
        return this.pwd;
    }

    public void setpassword(String pass)
    {
        this.pwd=pass;
    }
}


public class gettersetter
{
    public static void main(String[] args) 
    {
        account a=new account();
        a.name="Abc";
        a.email="abc@gmail.com";
        a.setpassword("12345");
        System.out.println("Name:"+a.name);
        System.out.println("Email:"+a.email);
       System.out.println("Password:"+a.getpassword());
    }
}