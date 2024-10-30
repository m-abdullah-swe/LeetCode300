import java.util.Arrays;

public class Leet2540MinimumCommonValue {
    class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        // Sort both arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        // Initialize two pointers for each array
        int i = 0, j = 0;

        // Traverse both arrays to find the first common element
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                return nums1[i];  // Return the first common element found
            } else if (nums1[i] < nums2[j]) {
                i++;  // Move the pointer in nums1 forward
            } else {
                j++;  // Move the pointer in nums2 forward
            }
        }

        // If no common element is found, return -1
        return -1;
    }
}
}
