package Array_String;

public class Reverse_Vowels_Of_A_String_Using_StringBuilder {
    public static String reverseVowels(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s); // To build the result
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (!isVowel(s.charAt(i))) {
                i++;
            } else if (!isVowel(s.charAt(j))) {
                j--;
            } else { // Both are vowels
                // Swap vowels in result StringBuilder
                sb.setCharAt(i, s.charAt(j));
                sb.setCharAt(j, s.charAt(i));
                i++;
                j--;
            }
        }
        return sb.toString();
    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public static void main(String[] args) {
        String str ="IceCreAm";
        System.out.println(reverseVowels(str));
    }
}
