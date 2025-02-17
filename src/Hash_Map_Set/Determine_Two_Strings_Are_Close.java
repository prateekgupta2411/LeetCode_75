package Hash_Map_Set;

import java.util.Arrays;

public class Determine_Two_Strings_Are_Close {
    public static boolean closeStrings(String word1, String word2) {
        // Check the two string lengths
        if (word1.length() != word2.length())
            return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < word1.length(); i++) {
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(i);

            freq1[ch1 - 'a']++;
            freq2[ch2 - 'a']++;
        }

        // 1st point - characters in word1 should also be in word2
        for (int i = 0; i < 26; i++) {
//            if ((freq1[i] != 0 && freq2[i] != 0) || (freq1[i] == 0 && freq2[i] == 0))
//                continue;
//            return false;
            if(freq1[i] > 0 && !(freq2[i]>0)){
                return false;
            }
        }

        // 2nd point - match frequencies
        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1, freq2);
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "bca";
        System.out.println(closeStrings(word1, word2));
    }
}
