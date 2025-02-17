package Hash_Map_Set;

import java.util.*;

public class Find_Difference_Two_Arrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        // Add elements of nums1 to set s1
        for (int num : nums1) {
            s1.add(num);
        }
        // Add elements of nums2 to set s2
        for (int num : nums2) {
            s2.add(num);
        }

        // Elements in nums1 but not in nums2
        List<Integer> l1 = new ArrayList<>();
        for (int num : s1) {
            if (!s2.contains(num))
                l1.add(num);
        }

        // Elements in nums2 but not in nums1
        List<Integer> l2 = new ArrayList<>();
        for (int num : s2) {
            if (!s1.contains(num))
                l2.add(num);
        }

        return Arrays.asList(l1, l2);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {2, 4, 6, 8, 10};

        List<List<Integer>> difference = findDifference(nums1, nums2);
        System.out.println("Difference: " + difference);
    }
}
