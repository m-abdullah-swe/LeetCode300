public class Leet278FirstBadVersion {

    /*
     * The isBadVersion API is defined in the parent class VersionControl.
     * boolean isBadVersion(int version);
     */

    public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            return recursiveSearch(1, n); // Start from version 1 to n
        }

        public int recursiveSearch(int start, int end) {
            // Base condition to stop recursion
            if (start == end) {
                return start;
            }

            int mid = start + (end - start) / 2; // Avoid potential overflow

            if (isBadVersion(mid)) {
                return recursiveSearch(start, mid); // Search in the left half
            } else {
                return recursiveSearch(mid + 1, end); // Search in the right half
            }
        }
    }

}