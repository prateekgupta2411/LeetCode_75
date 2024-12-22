package Array_String;

public class Product_Of_Array_ExceptSelf_Approach2 {
    public static int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] =1;
        for(int i=1;i<n;i++){
            left[i] = left[i-1] * arr[i-1];
        }
        for(int i=n-1;i>=0;i--){
        right[i-1] = 0;
        right[i] = right[i] * right[i-1];
        right
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};

    }
}
