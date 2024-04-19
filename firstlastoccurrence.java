import java.util.*;
public class firstlastoccurrence 
{
   public static int first=-1;
   public static int last=-1;

   public static void findoccurrence(String str,int idx,char elment)
   {
        if(idx==str.length())
        {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char currchar=str.charAt(idx);
        if(currchar==elment)
        {
            if(first==-1)
            {
                first=idx;
            }
            else 
            {
                last =idx;
            }
        }
        findoccurrence(str, idx+1, elment);

    }
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter any string with repeated characters:");
            String str=sc.next();
            findoccurrence(str, 0, 'a');
        }
   


}
