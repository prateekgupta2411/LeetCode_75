package Array_String;

import java.util.Arrays;

public class Product_Of_Array_ExceptSelf_Approach3 {
    public static int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int prefix[] = new int[n];
        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * arr[i - 1];
        }
        int suffix[] = new int[n];
        suffix[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * arr[i + 1];
        }
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = prefix[i] * suffix[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 0, 0};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
