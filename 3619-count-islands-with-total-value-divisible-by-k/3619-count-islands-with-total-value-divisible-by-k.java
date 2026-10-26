class Solution {
    public int countIslands(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    long sum = dfs(grid, i, j);
                    if (sum % k == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    long dfs(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length ||
            j >= grid[0].length || grid[i][j] == 0) {
            return 0;
        }
        int val = grid[i][j];
        grid[i][j] = 0;
        return val
            + dfs(grid, i + 1, j)
            + dfs(grid, i - 1, j)
            + dfs(grid, i, j + 1)
            + dfs(grid, i, j - 1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna