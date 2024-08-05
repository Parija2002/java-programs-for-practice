import java.util.*;
public class Hashmap 
{
    public static void main(String[] args) 
    {
        HashMap<Integer,String> map =new HashMap<>();

        //insertion 
        map.put(1, "ABC");
        map.put(2,"PQR");
        map.put(3,"XYZ");
        map.put(4,"JKL");
        System.out.println(map);

        //Searching
        System.out.println(map.get(1));
        System.out.println(map.get(4));

        //Checking key exists or not
        if(map.containsKey(3))
        {
            System.out.println("Key is Present");
        }
        else 
        {
            System.out.println("Key is not Present");
        }


        //iteration in hashmap
        for(Map.Entry<Integer,String>e:map.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //removing element from hashmap
        map.remove(2); //map.remove("key");
        System.out.println(map);
    }
}
