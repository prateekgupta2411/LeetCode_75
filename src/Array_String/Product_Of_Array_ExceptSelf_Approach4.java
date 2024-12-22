package Array_String;

import java.util.Arrays;

public class Product_Of_Array_ExceptSelf_Approach4 {
    // Two pass Approach Left and Right pass O(n) and space O(1)
    public static int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int res[] = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * arr[i - 1];
        }
        int rightProd = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] = res[i] * rightProd;
            rightProd *= arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4};
        int result[] = productExceptSelf(arr);
        System.out.println(Arrays.toString(result));
    }
}
