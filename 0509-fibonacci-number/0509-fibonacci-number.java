class Solution {
    public int fib(int n){
        int a = 0;
        int b = 1;
        int c = 0;
        if(n == 0 || n == 1){
            return n;
        }
        for (int i = 2; i<=n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna