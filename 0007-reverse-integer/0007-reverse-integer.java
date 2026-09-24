class Solution {
    public int reverse(int x) {
        int reverse = 0;
        for (; x != 0; x = x / 10) {
            int digit = x % 10;
            if (reverse > Integer.MAX_VALUE / 10 ||
                reverse < Integer.MIN_VALUE / 10) {
                return 0;
            }
            reverse = reverse * 10 + digit;
        }
        return reverse;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna