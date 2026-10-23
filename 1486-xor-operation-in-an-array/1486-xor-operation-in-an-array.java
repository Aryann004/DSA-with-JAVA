class Solution {
    public int xorOperation(int n, int start) {
        int rez = 0;
        for (int i = 0; i < n; i++) {
            rez ^= start + 2 * i;
        }
        return rez;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna