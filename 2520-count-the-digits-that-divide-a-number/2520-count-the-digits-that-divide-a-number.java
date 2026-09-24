class Solution {
    public int countDigits(int num) {
        int count = 0;
        for (int n = num; n > 0; n = n / 10) {
            int digit = n % 10;
            if (num % digit == 0) {
                count++;
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna