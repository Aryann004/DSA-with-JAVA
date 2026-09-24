class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int reverse = 0;
        if (x < 0) {
            return false;
        }
        for (; x > 0; x = x / 10) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
        }
        return original == reverse;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna