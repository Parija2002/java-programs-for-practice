//Most IMP

import java.util.Scanner;

public class sub_sequence 
{
    public static void subsequence(String str,int idx,String newstring) 
    {
        if(idx==str.length())
        {
            System.err.println(newstring);
            return ;
        }
        char currChar=str.charAt(idx);
        subsequence(str, idx+1, newstring+currChar);
        subsequence(str, idx+1, newstring);
    }


    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any string for subsequences:");
        String str1=sc.next();
        System.out.println("Subsequences Are:");
        subsequence(str1, 0, " ");

    }
}
