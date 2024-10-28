import java.util.Arrays;

public class Leet414ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int max,secondmax, thirdmax;
        secondmax = -1;
        max = nums[nums.length -1];
        for (int i = nums.length-2; i>-1; i--){
            if (nums[i]<max){
                secondmax =  nums[i];
                break;
            }
        }
        for (int i = nums.length-3; i>-1; i--){
            if (nums[i]<secondmax){
                return nums[i];
            }
        }
        System.err.println(max + " " +secondmax);
        if (nums.length <= 2){
            return max;
        }

        return 0;
    }

    public static void main(String[] args) {
        Leet414ThirdMaximumNumber l = new Leet414ThirdMaximumNumber();
        int[] nums = {2,1,1};
        System.out.println(l.thirdMax(nums));
    }
}
