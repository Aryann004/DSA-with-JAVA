class Solution {
    String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int end = s.length();

        for (int i = s.length() - 1; i >= -1; i--) {
            if (i == -1 || s.charAt(i) == '.') {
                if (end > i + 1) {  
                    if (sb.length() > 0) sb.append('.');
                    sb.append(s, i + 1, end);
                }
                end = i;
            }
        }
        return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna