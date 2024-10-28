public class Leet268MissingNumber {
    public int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (arrayContains(nums, i)){
                continue;
            }
            else {
                return  i;
            }
        }
        return 0;
    }

    public boolean arrayContains(int[] array, int num){
        for (int j = 0; j < array.length; j++) {
            if (array[j] == num) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Leet268MissingNumber leet = new Leet268MissingNumber();
        int[] nums = {4, 0, 3, 1};
        System.out.println(leet.missingNumber(nums));
    }
}
