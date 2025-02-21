package Stack;

import java.util.Stack;

public class Valid_Parentheses {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(st.isEmpty() || ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
                continue;
            }
            if (ch == ')' && st.peek() == '(') {
                st.pop();
            } else if (ch == '}' && st.peek() == '{') {
                st.pop();
            } else if (ch == ']' && st.peek() == '[') {
                st.pop();
            } else {
                return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String s = "{[()]}";
        System.out.println(isValid(s)); // true
        s = "({[)]}";
        System.out.println(isValid(s)); // false
    }
}
