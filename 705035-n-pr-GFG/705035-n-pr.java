class Solution {
    public long nPr(int n, int r) {
        // code here
        long fact1 = 1;
        long fact2 = 1;
        for(long i =2; i <=n;i++){
            fact1 *= i;
        }
        long sub = n-r;
        for(long i = 2; i <= sub;i++){
            fact2 *=i ;
        }
        return fact1/fact2;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna