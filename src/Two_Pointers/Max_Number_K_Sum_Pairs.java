package Two_Pointers;

import java.util.Arrays;
import java.util.HashMap;

public class Max_Number_K_Sum_Pairs {
    // Brute force O(n^2) operation
    public static int maxOperations(int[] nums, int k) {
        int n = nums.length;
        int maxOper = 0;
        boolean[] used = new boolean[n]; // Track which elements are used

        for (int i = 0; i < n - 1; i++) {
            if (used[i]) continue; // Skip if already used
            for (int j = i + 1; j < n; j++) {
                if (!used[j] && nums[i] + nums[j] == k) {
                    maxOper++;
                    used[i] = used[j] = true; // Mark elements as used
                    break; // Move to the next i
                }
            }
        }
        return maxOper;
    }

    // Two-pointers O(n log n) operation
    public static int maxOperations1(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums); // Sort the array
        int left = 0, right = n - 1;
        int maxOper = 0;

        while (left < right) {
            if (nums[left] + nums[right] == k) {
                maxOper++;
                left++;
                right--;
            } else if (nums[left] + nums[right] < k) {
                left++;
            } else {
                right--;
            }
        }
        return maxOper;
    }

    // HashMap
    public static int maxOperations2(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int maxOper = 0;

        for (int num : nums) {
            int complement = k - num;

            // Check if complement exists in the map
            if (freqMap.getOrDefault(complement, 0) > 0) {
                maxOper++; // Found a valid pair
                freqMap.put(complement, freqMap.get(complement) - 1); // Decrease count
            } else {
                // Store the current number
                freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            }
        }

        return maxOper;
    }


    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 4, 3};
        int k = 6;
        int result = maxOperations1(nums, k);
        System.out.println(result);
    }
}
