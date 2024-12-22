package Array_String;

import java.util.Arrays;

public class Product_Of_Array_ExceptSelf_Approach4 {
    // Two pass Approach Left and Right pass O(n) and space O(1)
    public static int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        ans[0] = 1;
        // prefix => res
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * arr[i - 1];
        }
        int suffix= 1;
        for (int i = n - 2; i >= 0; i--) {
            suffix = suffix * arr[i+1];
            ans[i] = ans[i] * suffix;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int result[] = productExceptSelf(arr);
        System.out.println(Arrays.toString(result));
    }
}
