class Solution {
    static boolean armstrongNumber(int n) {
        int sum = 0;
        int temp = n;
        
        while (n!= 0) {
            int digit = n%10;
            sum = sum + digit*digit*digit;
            n = n/10;
        }
        return temp == sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna