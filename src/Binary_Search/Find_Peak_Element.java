package Binary_Search;

public class Find_Peak_Element {
    public static int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    public static int findPeak(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Mid is not at boundaries
            if (mid > 0 && mid < n - 1) {
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    return mid;
                } else if (arr[mid] < arr[mid - 1]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // Edge case: First element
            else if (mid == 0) {
                return (arr[0] > arr[1]) ? 0 : 1;
            }
            // Edge case: Last element
            else if (mid == n - 1) {
                return (arr[n - 1] > arr[n - 2]) ? n - 1 : n - 2;
            }
        }

        return -1; // No peak element found (shouldn't happen for a valid input)
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        System.out.println(findPeak(arr));
    }
}
