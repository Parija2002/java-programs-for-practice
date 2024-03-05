import java.util.*;
public class reversestring 
{
   public static void main(String[] args) 
   {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any String: ");
        String str=sc.nextLine();
        String revstr="";

        for(int i=0;i<str.length();i++)
        {
            revstr=str.charAt(i)+revstr;
        }

        System.out.println("Original string is:"+str);
        System.out.println("Reversed String is:"+revstr);
        
   } 
}
