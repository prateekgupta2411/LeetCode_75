package Array_String;
import java.util.Arrays; // Import required for Arrays.toString()
public class Product_Of_Array_ExceptSelf_Approach1 {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int totalProduct = 1;
        int zeroCount = 0;

        // Calculate total product and count zeros
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                totalProduct *= num;
            }
        }

        // Handle cases based on the number of zeros
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                // If there's exactly one zero, the result at the zero's position is the total product
                result[i] = zeroCount == 1 ? totalProduct : 0;
            } else {
                // If there are no zeros, calculate the product by dividing
                result[i] = zeroCount == 0 ? totalProduct / nums[i] : 0;
            }
        }

        return result;
    }

public static void main(String[] args) {
    int[] nums = {1,2,3,4};
    int[] result = productExceptSelf(nums); // Call the function to get the result
    System.out.println(Arrays.toString(result)); // Print the array in a readable format
    }
}
