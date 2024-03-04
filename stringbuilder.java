import java.util.*;
public class stringbuilder 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder("Parija");
        System.out.println(sb);

        //set charAt index
        sb.setCharAt(0,'s');
        System.out.println(sb);

        //insert char at index
        sb.insert(4,'n');
        System.out.println(sb);

        //delete char at index
        sb.delete(4,6);
        System.out.println(sb);   
    }
    
}
