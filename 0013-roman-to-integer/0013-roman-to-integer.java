class Solution {
    public int romanToInt(String s) {
    //     int ans = 0;
    //     for (int i = 0; i < s.length(); i++) {
    //         int n = value(s.charAt(i));
    //         if (i + 1 < s.length() && n < value(s.charAt(i + 1)))
    //             ans -= n;
    //         else
    //             ans += n;
    //     }
    //     return ans;
    // }
    // int value(char c) {
    //     if (c == 'I') return 1;
    //     if (c == 'V') return 5;
    //     if (c == 'X') return 10;
    //     if (c == 'L') return 50;
    //     if (c == 'C') return 100;
    //     if (c == 'D') return 500;
    //     return 1000;
         int ans = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna