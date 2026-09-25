class Solution {
    public boolean isNumber(String s) {
        s = s.trim();
        boolean digit = false;
        boolean dot = false;
        boolean e = false;
        boolean digitAfterE = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= '0' && c <= '9') {
                digit = true;
                if (e)
                    digitAfterE = true;
            }
            else if (c == '.') {
                if (dot || e)
                    return false;
                dot = true;
            }
            else if (c == 'e' || c == 'E') {
                if (e || !digit)
                    return false;
                e = true;
                digitAfterE = false;
            }
            else if (c == '+' || c == '-') {
                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E')
                    return false;
            }
            else {
                return false;
            }
        }
        return digit && digitAfterE;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna