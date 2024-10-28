package ContainsDuplicate;

import java.util.*;
import java.util.Collections;

public class Leet179LargestNumber {

    public String largestNumber(int[] nums) {
        if (nums.length == 1) {
            return "" + nums[0];
        }
        Arrays.sort(nums);
        Collections.reverse(Arrays.asList(nums));
        // Arrays.toString(nums);

        ArrayList<String> allStrings = new ArrayList<>();

        for (int i = nums.length-1; i >=0; i--) {
            allStrings.add("" + nums[i]);
        }

        Collections.sort(allStrings,
        (s2, s1) -> Integer.compare(
        Character.getNumericValue(s1.charAt(0)),
        Character.getNumericValue(s2.charAt(0))));

        StringBuilder sb = new StringBuilder();
        for (String s : allStrings) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Leet179LargestNumber solution = new Leet179LargestNumber();
        int[] nums = { 3, 30, 34, 5, 9 };
        System.err.println(solution.largestNumber(nums));
    }
}
