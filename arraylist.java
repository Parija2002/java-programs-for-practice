import java.util.ArrayList;
import java.util.Collections;
public class arraylist
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> list =new ArrayList<Integer>();
        System.out.println("ArrayList:"+list);

        //add element
        for (int i=0;i<20;i++)
        {
            if(i%2==0)
            {
                list.add(i);

            }
        }
        System.out.println("ArrayList after appending new element:"+list);

        //get element
        int element=list.get(5);
        System.out.println("Number at index 5 is:"+element);

        //add element in between the list
        list.add(5,15);
        System.out.println("ArrayList after appending new element:"+list);

        //set element-change old element with new one
        list.set(1, 3) ;
        System.out.println("ArrayList after set element:"+list);

        //delete element
        list.remove(4);
        System.out.println("ArrayList after removing element:"+list);

        //size 
        System.out.println("size of ArrayList:"+list.size());

        //sorting
        Collections.sort(list);
        System.out.println("ArrayList after sorting:"+list);
    }
}