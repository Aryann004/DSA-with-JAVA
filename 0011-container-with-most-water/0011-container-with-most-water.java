class Solution {
    public int maxArea(int[] h) {
        int l = 0, r = h.length - 1, max = 0;
        while (l < r) {
            int area = Math.min(h[l], h[r]) * (r - l);
            max = Math.max(max, area);
            if (h[l] < h[r])
                l++;
            else
                r--;
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna