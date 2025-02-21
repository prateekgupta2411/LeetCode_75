package Stack;

import java.util.Stack;

public class Removing_Stars_From_String {
    public static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }
        return ans.reverse().toString();
    }

    public static String removeStars1(String s) {
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                result.setLength(result.length() - 1); // Removing last character (similar to pop_back())
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static String removeStartTwoPointer(String s){
        char[] ch = new char[s.length()];
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                if(j>0) {
                    j--;
                }
            } else {
                ch[j++] = s.charAt(i);
            }
        }

        return new String(ch, 0, j); // Convert char array to string from index 0 to j
    }

    public static void main(String[] args) {
        String input = "leet**cod*e";
        String result = removeStartTwoPointer(input);
        System.out.println(result); // Output: "lecoe"
    }
}
