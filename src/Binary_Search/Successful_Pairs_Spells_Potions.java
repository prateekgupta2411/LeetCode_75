package Binary_Search;

import java.util.Arrays;

public class Successful_Pairs_Spells_Potions {
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length; int m = potions.length;
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            int spell = spells[i];
            // apply BS on portion Array
            int left = 0; int right = m-1;
            while(left <= right){
                int mid = left + (right - left)/2;
                if((long) potions[mid] * spell >= success){
                    right = mid -1;
                }
                else{
                    left = mid+1;
                }
            }
            ans[i] = m - left;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] spells = {5,1,3};
        int[] potions = {1,2,3,4,5};
        int success = 7;
        int[] result = successfulPairs(spells, potions, success);
        System.out.println(Arrays.toString(result));
    }
}
