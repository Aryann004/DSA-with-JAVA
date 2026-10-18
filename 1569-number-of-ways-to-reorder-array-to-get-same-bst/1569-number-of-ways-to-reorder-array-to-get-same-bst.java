class Solution {
    static final int MOD = 1000000007;
    long[][] c = new long[1001][1001];
    public int numOfWays(int[] nums) {
        int n = nums.length;
        for (int i = 0; i <= n; i++) {
            c[i][0] = c[i][i] = 1;
            for (int j = 1; j < i; j++)
                c[i][j] = (c[i-1][j-1] + c[i-1][j]) % MOD;
        }
        return (int)((solve(nums) - 1 + MOD) % MOD);
    }
    long solve(int[] a) {
        if (a.length <= 2) return 1;
        java.util.List<Integer> left = new java.util.ArrayList<>();
        java.util.List<Integer> right = new java.util.ArrayList<>();
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[0]) left.add(a[i]);
            else right.add(a[i]);
        }
        int[] l = left.stream().mapToInt(i -> i).toArray();
        int[] r = right.stream().mapToInt(i -> i).toArray();
        return c[a.length - 1][left.size()] * solve(l) % MOD
             * solve(r) % MOD;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna