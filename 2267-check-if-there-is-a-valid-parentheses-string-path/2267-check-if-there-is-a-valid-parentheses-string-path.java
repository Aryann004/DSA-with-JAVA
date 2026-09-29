class Solution {
    Boolean[][][] dp;
    int m, n;
    public boolean hasValidPath(char[][] grid) {
        m = grid.length;
        n = grid[0].length;
        if ((m + n - 1) % 2 != 0)
            return false;
        if (grid[0][0] == ')' || grid[m - 1][n - 1] == '(')
            return false;
        dp = new Boolean[m][n][m + n];
        return solve(grid, 0, 0, 0);
    }
    boolean solve(char[][] grid, int i, int j, int balance) {
        if (balance < 0)
            return false;
        if (grid[i][j] == '(')
            balance++;
        else
            balance--;
        if (balance < 0)
            return false;
        if (i == m - 1 && j == n - 1)
            return balance == 0;
        if (dp[i][j][balance] != null)
            return dp[i][j][balance];
        boolean down = false;
        boolean right = false;
        if (i + 1 < m)
            down = solve(grid, i + 1, j, balance);
        if (j + 1 < n)
            right = solve(grid, i, j + 1, balance);
        return dp[i][j][balance] = down || right;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna