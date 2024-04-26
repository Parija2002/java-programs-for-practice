import java.util.*;

public class strpermutationrecur 
{
    public static void printperm(String str,String permutation) 
    {
        if(str.length()==0)
        {
            System.out.println(permutation);
            return ;
        }

        for(int i=0;i<str.length();i++)
        {
            char currChar=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            printperm(newstr, permutation+currChar);
        }    
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any String:");
        String str=sc.next();
        System.out.println("String Permutations Are:");
        printperm(str, " ");
        
    }
}
