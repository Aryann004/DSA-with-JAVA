import java.util.*;

class Solution {
    public List<Integer> exitPoint(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int row = 0, col = 0;
        int dir = 0;

        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        while (row >= 0 && row < n && col >= 0 && col < m) {

            if (mat[row][col] == 1) {
                mat[row][col] = 0;
                dir = (dir + 1) % 4;
            }
            row += dr[dir];
            col += dc[dir];
        }
        row -= dr[dir];
        col -= dc[dir];

        List<Integer> ans = new ArrayList<>();
        ans.add(row);
        ans.add(col);
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna