class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int[]ans=new int[3];
        int len=nums.length-1;
        ans[0]=Math.abs(nums[len-1]-nums[1]);
        ans[1]=Math.abs(nums[len-2]-nums[0]);
        ans[2]=Math.abs(nums[2]-nums[len]);
        return Math.min(ans[0],Math.min(ans[1],ans[2]));
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna