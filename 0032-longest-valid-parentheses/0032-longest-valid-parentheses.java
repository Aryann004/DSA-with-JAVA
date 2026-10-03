class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        int[] dp = new int[n];
        int max = 0;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = 2;
                    if (i >= 2)
                        dp[i] += dp[i - 2];
                } else {
                    int j = i - dp[i - 1] - 1;
                    if (j >= 0 && s.charAt(j) == '(') {
                        dp[i] = dp[i - 1] + 2;
                        if (j >= 1)
                            dp[i] += dp[j - 1];
                    }
                }
                max = Math.max(max, dp[i]);
            }
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna