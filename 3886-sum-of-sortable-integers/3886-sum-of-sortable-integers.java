class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length, ans = 0;
        int[] mx = new int[n + 1];
        int[] mn = new int[n + 1];
        int[] drop = new int[n];
        for (int i = 0; i < n; i++)
            mx[i + 1] = Math.max(mx[i], nums[i]);
        mn[n] = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--)
            mn[i] = Math.min(nums[i], mn[i + 1]);
        for (int i = 1; i < n; i++)
            drop[i] = drop[i - 1] + (nums[i - 1] > nums[i] ? 1 : 0);
        for (int k = 1; k <= n; k++) {
            if (n % k != 0) continue;
            boolean ok = true;
            for (int i = 0; i < n; i += k) {
                int end = i + k - 1;
                int d = drop[end] - drop[i];
                if (nums[end] > nums[i]) d++;
                if (d > 1 || mx[i] > mn[i]) {
                    ok = false;
                    break;
                }
            }
            if (ok) ans += k;
        }
        return ans;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna