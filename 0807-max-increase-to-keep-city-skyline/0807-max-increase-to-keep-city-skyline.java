class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] rowMax = new int[n];
        int[] colMax = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rowMax[i] = Math.max(rowMax[i], grid[i][j]);
            }
        }
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                colMax[j] = Math.max(colMax[j], grid[i][j]);
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans += Math.min(rowMax[i], colMax[j]) - grid[i][j];
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna