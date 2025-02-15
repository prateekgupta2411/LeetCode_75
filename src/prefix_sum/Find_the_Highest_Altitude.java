package prefix_sum;

public class Find_the_Highest_Altitude {
    public static int largestAltitude(int[] gain) {
        int alt = 0;
        int max = 0;
        for(int i=0;i<gain.length;i++){
            alt += gain[i];
            max = Math.max(max,alt);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {-4,-3,-2,-1,4,3,2};
        int highestAltitude = largestAltitude(arr);
        System.out.println("The highest altitude is: " + highestAltitude);
    }
}
