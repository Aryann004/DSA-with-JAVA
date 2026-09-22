class Solution {
    public int arraySign(int[] nums) {
        int sign = 1;
        for (int n : nums){
            if(n==0){
                return 0;
            }
            else if(n <= 0){
                    sign = -sign;
                }
            }
            return sign;
        }
    }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna