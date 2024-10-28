import java.util.HashMap;
import java.util.Map;

public class Leet169MajorityElement {
    public int majorityElement(int[] nums) {
        int majority = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        int largestKey = 0;
        int largestValue = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value > largestValue) {
            largestKey = key;
            largestValue = value;
        }
        System.err.println("Key: " + key + " value: " + value);
        }
        System.err.println("Key: " + largestKey + " value: " + largestValue);

        if (largestValue> majority){
            return largestKey;
        }
        return 0;

    }

    public static void main(String[] args) {
        Leet169MajorityElement leet = new Leet169MajorityElement();
        int[] nums = { 3, 3, 4};
        System.out.println(leet.majorityElement(nums));
    }
}
