package ContainsDuplicate;

import java.util.Arrays;

public class Leet162162FindPeakElement {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        return checkPeak(nums, nums.length - 1);
    }

    int checkPeak(int nums[], int i) {
        if (i < 0) {
            return 0;
        }
        if (i - 1 >= 0 && i + 1 < nums.length && nums[i] > nums[i + 1] && nums[i] > nums[i - 1]) {
            return i;
        }
        if (i + 1 < nums.length && nums[i] > nums[i + 1]) {
            if (nums.length == 2) {
                return i;
            }
            if (i - 1 >= 0 && nums[i] > nums[i - 1]) {
                return i;
            }
        }
        if (i - 1 >= 0 && nums[i] > nums[i - 1]) {
            return i;
        }
        return checkPeak(nums, --i);
    }

    public static void main(String[] args) {
        Leet162162FindPeakElement solution = new Leet162162FindPeakElement();
        int[] array = { 1,2,3 };
        System.err.println(solution.findPeakElement(array));
    }
}
