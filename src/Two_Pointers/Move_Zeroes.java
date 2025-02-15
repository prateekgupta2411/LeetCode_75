package Two_Pointers;

import static java.util.Collections.swap;

public class Move_Zeroes {
    // Agr muje Order mantain nhi krna to use this logic
    public static void moveZeroes(int[] arr) {
        int left = 0, right = arr.length-1;
        while (left <= right) {
            if(arr[left] ==0 && arr[right] !=0){
              int temp = arr[left];
              arr[left] = arr[right];
              arr[right] = temp;
              left++;
              right--;
            }
            if(arr[left] != 0){
                left++;
            }
            if(arr[right] == 0){
                right--;
            }
        }
    }

    // but i want to maintain the order of array
    public static void moveZeroes1(int[] arr){
        int i = 0; int j = 0;
        while(j < arr.length){
            if(arr[j] != 0){
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }

    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes1(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
