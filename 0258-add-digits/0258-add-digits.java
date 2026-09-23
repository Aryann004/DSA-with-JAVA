class Solution {
    public int addDigits(int num) {
        if (num == 0)
            return 0;
        return 1 + (num - 1) % 9;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna