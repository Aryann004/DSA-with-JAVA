
class Solution {
    public String removeOuterParentheses(String s) {
        String ans = "";
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (count > 0) ans += c;
                count++;
            } else {
                count--;
                if (count > 0) ans += c;
            }
        }
        return ans;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna