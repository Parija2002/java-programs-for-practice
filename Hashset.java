import java.util.*;
public class Hashset
{
    public static void main(String args[])
{
    HashSet<Integer> set=new HashSet<>();

    //insert
    set.add(1);
    set.add(2);
    set.add(5);
    set.add(8);

    //search
    if(set.contains(1))
    {
        System.out.println("Set contains 1");
    }
    if(!set.contains(4))
    {
        System.out.println("Set doesn't contain 4");
    }

    //size
    System.out.println(set.size());

    //print all elements
    System.out.println(set);


    //delete
    set.remove(2);
    if(!set.contains(2))
    {
        System.out.println("Set doesn't contain 2"); 
    }
    System.out.println(set);

    //Iterator

    Iterator it=set.iterator();
    while (it.hasNext()) 
    {
        System.out.println(it.next());     
    }
}
}