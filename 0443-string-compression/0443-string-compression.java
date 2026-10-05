class Solution {
    public int compress(char[] c) {
        int k = 0;
        for (int i = 0; i < c.length; ) {
            char ch = c[i];
            int j = i;
            while (j < c.length && c[j] == ch) j++;
            c[k++] = ch;
            if (j - i > 1) {
                for (char x : String.valueOf(j - i).toCharArray())
                    c[k++] = x;
            }
            i = j;
        }
        return k;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna