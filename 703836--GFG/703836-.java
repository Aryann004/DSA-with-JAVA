class Solution {
    public int maxSubarraySum(int[] nums, int k) {
                int n=nums.length;
                int windowsum=0;
                for(int i=0;i<k;i++){
                    windowsum+=nums[i];
                }
                int max_ans=windowsum;
                for(int j=k;j<n;j++){
                    windowsum+=nums[j];
                    windowsum-=nums[j-k];
                    max_ans=Math.max(max_ans,windowsum);
                }return max_ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna