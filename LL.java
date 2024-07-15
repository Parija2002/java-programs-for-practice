import java.util.*;
public class LL
{
    public static void main(String[] args) 
    {
        LinkedList <String> list =new LinkedList<>();
        list.addFirst("an");
        list.addFirst("Toy");
        list.add(1,"is");
        list.add("object");
        System.out.println(list);
        
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+"->");
        }
        System.out.print("null");
    }
}