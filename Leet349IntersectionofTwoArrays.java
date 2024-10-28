import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // ArrayList<Integer> list = new ArrayList<Integer>();
        // for (int i = 0; i < nums1.length; i++) {
        //     for (int j = 0; j < nums2.length; j++) {
        //         if (nums1[i] == nums2[j] && !list.contains(nums2[j])) {
        //             list.add(nums2[j]);
        //         }
        //     }
        // }
        // int[] arr = new int[list.size()];

        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = list.get(i);
        // }
        // return arr;
        List<Integer> list =  new ArrayList<Integer>();
        list.addAll(Integer.valueOf(Arrays.asList(nums1)));
        Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(nums1));
        set1.retainAll(Arrays.asList(nums2));
    }
}