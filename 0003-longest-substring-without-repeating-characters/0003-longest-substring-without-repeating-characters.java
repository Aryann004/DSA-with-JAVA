class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean[] seen = new boolean[128];
            int count = 0;
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (seen[ch] == true) {
                    break;
                }
                seen[ch] = true;
                count++;
                if (count > max) {
                    max = count;
                }
            }
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna