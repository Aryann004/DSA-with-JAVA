class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        while(i < nums.length){
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
            i += 2;
        }
        return nums;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna