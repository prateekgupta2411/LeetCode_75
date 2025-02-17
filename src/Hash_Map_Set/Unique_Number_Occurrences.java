package Hash_Map_Set;

import java.util.HashMap;
import java.util.HashSet;

public class Unique_Number_Occurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0) +1);
        }
        HashSet<Integer> count = new HashSet<>(map.values());
        return map.size() == count.size();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }
}
