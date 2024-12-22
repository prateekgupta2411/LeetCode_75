package Array_String;

import java.util.Arrays;

public class Product_Of_Array_ExceptSelf_Approach1 {
    public static int[] productExceptSelf(int[] arr) {
        int ans[] = new int[arr.length];
        Arrays.fill(ans,1);
        for(int i=0;i<arr.length;i++){
//            int prod = 1;
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    ans[i] *= arr[j];
                }
            }
//            ans[i] =prod;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,0,0};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
}
