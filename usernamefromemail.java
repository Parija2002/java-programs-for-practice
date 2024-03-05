import java.util.*;
public class usernamefromemail 
{
       public static void main(String args[]) 
       
       {
         Scanner sc = new Scanner (System.in);
         System.out.println("Enter your Email address: ");
         String email = sc.next();
         String userName = "";
    
    
         for(int i=0; i<email.length(); i++)
          {
           if(email.charAt(i) == '@')
            {
            break;
           } 
           else 
           {
             userName += email.charAt(i);
           }
         }
    
    
         System.out.println("Your Username Is:"+userName);
       }
    }
     
