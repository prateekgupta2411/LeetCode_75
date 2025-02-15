package Two_Pointers;
import java .util.*;
public class Is_Subsequence {
    public static void main(String[] args) {
        String s = "abc"; String t = "ahbgdc";
        System.out.println(isSubsequence1(s, t)); // true
    }
    public static boolean isSubsequence1(String s, String t) {
        Map<Character, List<Integer>> mp = new HashMap<>();

        // Saving indices of each character in t
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            mp.putIfAbsent(ch, new ArrayList<>());
            mp.get(ch).add(i);
        }

        int prev = -1;
        // Now, look if we can find characters of s with increasing indices
        for (char ch : s.toCharArray()) {
            if (!mp.containsKey(ch)) {
                return false;
            }

            List<Integer> indices = mp.get(ch);
            int idx = Collections.binarySearch(indices, prev + 1);

            if (idx < 0) {
                idx = -idx - 1;
            }

            if (idx == indices.size()) {
                return false;
            }

            prev = indices.get(idx);
        }

        return true;
    }

    public static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;j++;
            } else{
                j++;
            }
        }
        return i==s.length();
    }
}
