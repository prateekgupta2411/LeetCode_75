package Array_String;

public class Reverse_Vowels_Of_A_String_ConvertChar_Array {
    public static String reverseVowels(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();// convert string to char Array for modification
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (!isVowel(arr[i])) {
                i++;
            } else if (!isVowel(arr[j])) {
                j--;
            } else { // Both are vowels
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr); //Convert char array to back to string
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
