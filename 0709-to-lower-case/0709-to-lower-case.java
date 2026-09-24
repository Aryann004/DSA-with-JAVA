class Solution {
    public String toLowerCase(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result = result + Character.toLowerCase(s.charAt(i));
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna