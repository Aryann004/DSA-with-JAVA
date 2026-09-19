class Solution {
    public boolean isPower(int x, int y) {
        // code here
        for (int i = 0; i<= 30; i++){
                if(y == Math.pow(x,i)){
                return true;
            }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna