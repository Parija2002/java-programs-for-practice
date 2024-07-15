import java.util.*;

public class usingclctnfrmwrk 
{
    public static void main(String[] args) 
    {
        Stack<Integer> s = new Stack<>();
        
        // Push elements onto the stack
        for (int i = 0; i <6; i++)  // Assuming you want to push the numbers 0-6 onto the stack
        {
            s.push(i);
        }

        // Print and pop elements from the stack
        while (!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
