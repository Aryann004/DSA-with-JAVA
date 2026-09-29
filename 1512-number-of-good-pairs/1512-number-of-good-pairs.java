class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i =0; i< nums.length;i++){
            for (int j= 0; j< nums.length;j++){
                if(nums[i] == nums[j] && i<j){
                    count ++;
                }
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna