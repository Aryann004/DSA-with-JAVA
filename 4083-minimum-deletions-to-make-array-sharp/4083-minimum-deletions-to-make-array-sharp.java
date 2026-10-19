class Solution {
    public int minDeletions(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n - 1; i++){
            if(nums[i] == nums[i+1]){
                count++;
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna