package Array_String;

import java.util.Arrays;

public class Product_Of_Array_ExceptSelf_Approach1 {
    public static int[] productExceptSelf(int[] arr) {
        int ans[] = new int[arr.length];
        Arrays.fill(ans,1);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    ans[i] *= arr[j];
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
}
