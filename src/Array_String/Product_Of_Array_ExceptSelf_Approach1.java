package Array_String;
import java.util.Arrays;
public class Product_Of_Array_ExceptSelf_Approach1 {
    // using division operation
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int totalProduct = 1;
        int zeroCount = 0;

        // Step 1: Calculate the total product of all elements and count zeros
        for (int num : nums) {
            if (num != 0) {
                totalProduct *= num;
            } else {
                zeroCount++;
            }
        }

        // Step 2: Handle cases based on zero count
        for (int i = 0; i < n; i++) {
            if (zeroCount > 1) {
                // If more than one zero, all products will be zero
                ans[i] = 0;
            } else if (zeroCount == 1) {
                // If exactly one zero, only the index with zero will have non-zero product
                ans[i] = (nums[i] == 0) ? totalProduct : 0;
            } else {
                // Normal case, divide total product by nums[i]
                ans[i] = totalProduct / nums[i];
            }
        }

        return ans;
    }

public static void main(String[] args) {
    int[] nums = {1,2,0,0};
    int[] result = productExceptSelf(nums); // Call the function to get the result
    System.out.println(Arrays.toString(result)); // Print the array in a readable format
    }
}
