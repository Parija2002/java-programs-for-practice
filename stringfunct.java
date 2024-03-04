import java.util.*;
public class stringfunct 
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter any two string:");
       String str1=sc.nextLine();
       String str2=sc.nextLine();


       //calculate length of string
       System.out.println("length of string is:"+str1.length());

       //printing string indexwise using charAt()
       for(int i=0;i<str1.length();i++)//take condition as "<" not "<="
       {
        System.out.println(str1.charAt(i));
       }

       //comparing of two string
       if(str1.compareTo(str2)==0)
       {
        System.out.println("Strings are equal");
       }
       else{
        System.out.println("Strings are not equal");
       }

       //calculating substring
       System.out.println(str1.substring(11,17));

    }    
}
