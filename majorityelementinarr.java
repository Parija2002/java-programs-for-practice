import java.util.HashMap;

public class majorityelementinarr {
    public static void majorityElement(int num[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = num.length;

        // Populate the hashmap with counts of each element
        for (int i = 0; i < n; i++) {
            if (map.containsKey(num[i])) 
            {
                map.put(num[i], map.get(num[i]) + 1);
            } 
            else 
            {
                map.put(num[i], 1);
            }
        }

        // Traverse the hashmap to find elements appearing more than n/3 times
        for (int key : map.keySet()) 
        {
            if (map.get(key) > n / 3) 
            {
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) 
    {
        int num[] = {1, 2, 3, 5, 1, 3, 5, 2, 1,3,1,2,1};
        majorityElement(num);
    }
}
