package ContainsDuplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Leet747LargestNumberAtleastTwiceOfOthers {
    public int dominantIndex(int[] nums) {
        // Map<Integer, Integer> map = new HashMap<>();
        // int max = nums[0];
        // for (int i = 0; i < nums.length; i++) {
        // if (i != 0) {
        // if (nums[i] > nums[max]) {
        // max = i;
        // }
        // }
        // map.put(i, 2 * nums[i]);
        // }
        // int flag = 0;
        // for (Entry<Integer, Integer> entry : map.entrySet()) {
        // if (entry.getValue() < nums[max]) {
        // flag++;
        // continue;
        // } else {
        // flag = 0;
        // }
        // }
        // if (flag == 0) {
        // return -1;
        // } else if (flag > 0) {
        // return max;
        // }
        // return -1;



        // int[] copy = new int[nums.length];
        // for (int i = 0; i < nums.length; i++) {
        //     copy[i] = nums[i];
        // }
        // Arrays.sort(copy);
        // int max = copy[copy.length - 1];
        // if (max >= 2 * copy[copy.length - 2]) {
        //     for (int i = 0; i < nums.length; i++) {
        //         if (nums[i] == max) {
        //             return i;
        //         }
        //     }
        // }
        //     return -1;
        
    }

    public static void main(String[] args) {
        Leet747LargestNumberAtleastTwiceOfOthers solution = new Leet747LargestNumberAtleastTwiceOfOthers();
        int[] nums = { 3,6,1,0 };
        System.err.println("Result: " + solution.dominantIndex(nums));
    }
}