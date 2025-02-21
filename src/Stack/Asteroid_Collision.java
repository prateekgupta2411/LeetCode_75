package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Asteroid_Collision {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int a : asteroids) {
            while (!stack.isEmpty() && a < 0 && stack.peek() > 0) {
                int sum = a + stack.peek();
                if (sum < 0) {
                    stack.pop();
                } else if (sum > 0) {
                    a = 0;
                    break;
                } else {
                    stack.pop();
                    a = 0;
                }
            }

            if (a != 0) {
                stack.push(a);
            }
        }

        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
    public static int[] asteroidCollision1(int[] asteroids) {
        List<Integer> st = new ArrayList<>();

        for (int a : asteroids) {
            while (!st.isEmpty() && a < 0 && st.get(st.size() - 1) > 0) {
                int sum = a + st.get(st.size() - 1);
                if (sum < 0) {
                    st.remove(st.size() - 1);
                } else if (sum > 0) {
                    a = 0;
                    break;
                } else {
                    st.remove(st.size() - 1);
                    a = 0;
                }
            }

            if (a != 0) {
                st.add(a);
            }
        }

        int[] result = new int[st.size()];
        for (int i = 0; i < st.size(); i++) {
            result[i] = st.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] asteroids = {5, 10, -5};
        int[] result = asteroidCollision1(asteroids);

        for (int asteroid : result) {
            System.out.print(asteroid + " "); // Output: [5, 10]
        }
    }
}
