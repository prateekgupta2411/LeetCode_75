package Sliding_Window;

public class Max_Consecutive_Ones_III {
    public static int longestOnes(int[] nums, int k) {
        int left = 0, maxLength = 0, zeroCount = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,1,0,0,0,1,1,1,1,0}; int k = 2;
        System.out.println(longestOnes(nums,k));
    }
}
