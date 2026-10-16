class Solution {
    int mod = 1000000007;
    long[] s, q, lazy;
    int n;
    public int sumCounts(int[] nums) {
        n = nums.length;
        s = new long[4 * n];
        q = new long[4 * n];
        lazy = new long[4 * n];

        java.util.HashMap<Integer, Integer> last = new java.util.HashMap<>();
        long ans = 0;
        for (int i = 0; i < n; i++) {
            int l = last.getOrDefault(nums[i], -1) + 1;
            add(1, 0, n - 1, l, i);
            last.put(nums[i], i);
            ans = (ans + q[1]) % mod;
        }
        return (int) ans;
    }
    void apply(int x, int a, int b, long v) {
        long len = b - a + 1;
        q[x] = (q[x] + 2 * v * s[x] + v * v % mod * len) % mod;
        s[x] = (s[x] + v * len) % mod;
        lazy[x] = (lazy[x] + v) % mod;
    }
    void push(int x, int a, int b) {
        if (lazy[x] == 0 || a == b) return;
        int m = (a + b) / 2;
        apply(x * 2, a, m, lazy[x]);
        apply(x * 2 + 1, m + 1, b, lazy[x]);
        lazy[x] = 0;
    }
    void add(int x, int a, int b, int l, int r) {
        if (l > b || r < a) return;
        if (l <= a && b <= r) {
            apply(x, a, b, 1);
            return;
        }
        push(x, a, b);
        int m = (a + b) / 2;
        add(x * 2, a, m, l, r);
        add(x * 2 + 1, m + 1, b, l, r);
        s[x] = (s[x * 2] + s[x * 2 + 1]) % mod;
        q[x] = (q[x * 2] + q[x * 2 + 1]) % mod;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna