public class Leet75SortColors {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
    }

    public static void main(String[] args) {
        Leet75SortColors leet75SortColors = new Leet75SortColors();
        int[] nums = {2,0,2,1,1,0};
        leet75SortColors.sortColors(nums);
    }
}
