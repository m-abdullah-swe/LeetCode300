package ContainsDuplicate;

import java.util.Collections;

public class Leet34FindFirstandLastPositionofElementinSortedArray {
    // class Solution {
        public int[] searchRange(int[] nums, int target) {
            // for (int i = 0; i < nums.length; i++) {
            //     if (nums[i] == target) {
            //         if (i + 1 < nums.length && nums[i + 1] == target) {
            //             if(i + 2 < nums.length && nums[i+2] == target){
            //                 if (i + 3 < nums.length && nums[i + 3] == target) {
            //                     return new int[] { i, i + 3 % nums.length };
            //                 } else {
            //                     return new int[] { i, i + 2 % nums.length };
            //                 }
            //             }
            //             else {
            //                 return new int[] { i, i + 1 % nums.length };
            //             }
            //         } else {
            //             return new int[] { i, i };
            //         }
            //     }
            // }
            // return new int[] { -1, -1 };
            int first = -1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target){
                    first = i;
                    break;
                }
            }
            int last = findLast(nums, target);
            if (first != -1 && last != -1){
                return new int[] {first, last};
            }
            return new int[] { -1, -1 };
        }

        int findLast(int[] nums,int target){
            int last = -1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target){
                    last = i;
                    if (nums[i+1] > target){
                        return last;
                    }
                }
            }
            return last;
        }

        public static void main(String[] args) {
            Leet34FindFirstandLastPositionofElementinSortedArray solution = new Leet34FindFirstandLastPositionofElementinSortedArray();
            int nums[] = { 1, 2, 3, 3, 3, 3, 4, 5, 9};
            int[] result = solution.searchRange(nums, 3);
            System.err.println(result[0] + "  " + result[1]);
        }
    }
// }
