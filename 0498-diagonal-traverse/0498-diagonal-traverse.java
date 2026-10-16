class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[] ans = new int[m * n];
        int k = 0;
        for (int d = 0; d < m + n - 1; d++) {
            if (d % 2 == 0) {
                int r = Math.min(d, m - 1);
                int c = d - r;
                while (r >= 0 && c < n) {
                    ans[k++] = mat[r][c];
                    r--;
                    c++;
                }
            } else {
                int c = Math.min(d, n - 1);
                int r = d - c;
                while (r < m && c >= 0) {
                    ans[k++] = mat[r][c];
                    r++;
                    c--;
                }
            }
        }
        return ans;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna