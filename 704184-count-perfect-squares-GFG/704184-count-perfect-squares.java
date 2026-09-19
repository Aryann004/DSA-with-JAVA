class Solution {
    static int countSquares(int n) {
        // code here
        int count = 0;
        for (int i = 1; i <Math.sqrt(n); i++){
            if (i*i < n){
                count ++;
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna