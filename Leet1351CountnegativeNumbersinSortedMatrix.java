public class Leet1351CountnegativeNumbersinSortedMatrix {
    class Solution {
        public int countNegatives(int[][] grid) {
            int count = 0;
            for (int m = grid.length - 1; m >= 0; m--) {
                for (int n = 0; n < grid[m].length; n++) { // Fixed boundary here
                    if (grid[m][n] < 0) {
                        count += grid[m].length - n; // Count all remaining elements in the row
                        break; // Move to the next row
                    }
                }
            }
            return count;
        }
    }
    
}
