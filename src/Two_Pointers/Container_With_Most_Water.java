package Two_Pointers;

public class Container_With_Most_Water {
    // Brute Force Method
    public static int maxArea(int[] height) {
        // brute force is you can find all 2 possibility of the height
        int max = 0;
        for(int i=0;i<height.length;i++){
            for(int j = i+1;j<height.length;j++){
                int width = j-i;
                int area = width * Math.min(height[i], height[j]);
                max = Math.max(max, area);
            }
        }
        return max;
    }
    //----------------------------------------------------------------
    // Two Pointer Method
    public static int maxArea1(int[] height) {
        int maxArea = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            int width = right - left;
            int ht = Math.min(height[left], height[right]);
            int currWater = ht * width;
            maxArea = Math.max(maxArea, currWater);
            if(height[left] < height[right]) {
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea1(height));
    }
}
