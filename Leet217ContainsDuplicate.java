import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // map.put(0, nums[0]);
        // for (int i = 1; i < nums.length; i++) {
        // if (map.containsValue(nums[i])) {
        // return true;
        // } else {
        // map.put(i, nums[i]);
        // }
        // }
        // return false;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}