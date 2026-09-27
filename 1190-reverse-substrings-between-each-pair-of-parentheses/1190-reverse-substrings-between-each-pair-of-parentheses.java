class Solution {
    public String reverseParentheses(String s) {
        StringBuilder str = new StringBuilder(s);
        while (str.indexOf("(") != -1) {
            int open = str.lastIndexOf("(");
            int close = str.indexOf(")", open);
            String part = str.substring(open + 1, close);
            String rev = new StringBuilder(part).reverse().toString();

            str.replace(open, close + 1, rev);
        }
        return str.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna