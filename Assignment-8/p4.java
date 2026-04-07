import java.util.HashMap;
import java.util.Map.Entry;

public class p4 {
    public static void main(String[] args) {
        int []arr = {1,1,2,2,2,3,3,3};
        int k = 2;
        HashMap <Integer,Integer> hm = new HashMap<>();

        for (int idx = 0; idx < arr.length; idx++) {
           hm.put(arr[idx],hm.getOrDefault(arr[idx], 0)+1);
            
        }

        System.out.println(hm);

        for(Entry<Integer, Integer> entry : hm.entrySet()){
            if (entry.getValue()>k) {
                System.out.println(entry.getKey());
            }
        }
    }
}
