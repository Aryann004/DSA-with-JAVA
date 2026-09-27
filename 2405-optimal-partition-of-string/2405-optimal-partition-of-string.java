class Solution {
    public int partitionString(String s) {
        boolean[] seen = new boolean[26];
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (seen[index]) {
                count++;
                seen = new boolean[26];
            }
            seen[index] = true;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna