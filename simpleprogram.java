import java.util.*;
public class simpleprogram 
{

    public static void printperm(String str,String perm,int idx) 
    {
        if(str.length()==0)
        {
            System.out.println(perm);
            return;
        }
        //for calculating all permutation take for loop

        for(int i=0;i<str.length();i++)
        {
            char currchar=str.charAt(i);
            String newstr =str.substring(0,i)+str.substring(i+1);
            printperm(newstr, perm+currchar, idx+1);
        }
        
    }

    public static void main(String[] args) 
    {
       Scanner sc=new  Scanner(System.in); 
       System.out.println("Enter Any String:");
       String newstr=sc.next();
       System.out.println("Permutations Are:");
       printperm(newstr, " ", 0);
    }
}
