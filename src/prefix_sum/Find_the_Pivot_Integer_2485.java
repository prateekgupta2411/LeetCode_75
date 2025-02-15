package prefix_sum;

public class Find_the_Pivot_Integer_2485 {
    public static int pivotInteger(int n) {
        int ls = 0;
        int rs = n * (n + 1) / 2;
        for (int k = 1; k <= n; k++) {
            ls += k;
            rs -= k - 1;
            if (ls == rs) {
                return k;
            }
        }
        return -1;
    }

    public static int pivotInteger1(int n) {
        int cs = n * (n + 1) / 2;
//        int pivot = (int) Math.sqrt(cs);
        double pivot = Math.sqrt(cs);
        if(pivot % 1 != 0){
            return -1;
        }
        return (int)pivot;
//        return (pivot * pivot == cs) ? pivot : -1;
    }

    public static void main(String[] args) {
        int n = 8;
        int pivot = pivotInteger1(n);
        System.out.println(pivot);
    }
}
