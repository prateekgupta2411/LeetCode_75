package Sliding_Window;

public class Max_No_Of_Vowel_Given_SubString {
    public static int maxVowels(String s, int k) {
        int n = s.length();
        int maxVowels = 0;
        for (int i = 0; i < n - k + 1; i++) {
            int ans = 0;
            for (int j = i; j <= i + k - 1; j++) {
                char ch = s.charAt(j);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    ans++;
                }
            }
            maxVowels = Math.max(maxVowels, ans);
        }
        return maxVowels;
    }
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public static int slidingWindow(String s, int k) {
        int n = s.length();
        int maxVowels = 0;
        int count = 0;
        // calculate for 1st k
        for (int i = 0; i < k; i++) {
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        maxVowels = count;
        for (int j = 1; j < n - k + 1; j++) {
            char prevElement = s.charAt(j-1);
            char nextElement = s.charAt(j+k-1);
            if(isVowel(prevElement)){
                count--;
            }
            if(isVowel(nextElement)){
                count++;
            }
            maxVowels = Math.max(maxVowels,count);
        }
        return maxVowels;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        int k = 3;
        System.out.println(maxVowels(s, k));
        System.out.println(slidingWindow(s,k));
    }
}
