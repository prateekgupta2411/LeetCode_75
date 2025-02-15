package prefix_sum;

public class Find_Pivot_Index {
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        int leftSum = 0;
        for(int i = 0; i < nums.length; i++){
            if(leftSum == sum - leftSum - nums[i]){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {2,1,-1};
        System.out.println(pivotIndex(nums));
    }
}
