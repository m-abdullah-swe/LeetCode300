public class Leet704BinarySearch {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    public int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1; // Return -1 if the target is not found
        }
        int mid = (start + end) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, end);
        } else { // `arr[mid] > target`
            return binarySearch(arr, target, start, mid - 1); // Corrected here
        }
    }
}
