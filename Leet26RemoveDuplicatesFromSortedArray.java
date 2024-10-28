import java.util.ArrayList;
import java.util.List;

public class Leet26RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int current = 500;
        List<Integer> expectedNums = new ArrayList<>();
        
        for (int i =0; i<nums.length; i++){
            if(current == nums[i]){
                continue;
            }
            else {
                expectedNums.add(nums[i]);
                current = nums[i];
                k++;
            }
        }

int j = 0;
        for (int i: expectedNums){
            nums[j] = i;
            j++;
        }
        return k;
    }

    public static void main(String[] args) {
        Leet26RemoveDuplicatesFromSortedArray solution = new Leet26RemoveDuplicatesFromSortedArray
        ();
        int[] nums = {1, 1, 2, 2, 3,5};
        int result = solution.removeDuplicates(nums);
        
    }
}
