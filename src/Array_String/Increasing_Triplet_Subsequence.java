package Array_String;

public class Increasing_Triplet_Subsequence {
    public static boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        int num1 = Integer.MAX_VALUE;
        int num2 = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            int num3 = nums[i];
            // first ask num1
            if(num3 <= num1){
                num1 = num3;
            } else if(num3 <= num2){ // ask num2
                num2 = num3;
            } else{ // num1<num2 ki life set he already
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        System.out.println(increasingTriplet(nums));
    }
}
