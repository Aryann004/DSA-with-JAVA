class Solution {
    public int findDuplicate(int[] nums) {
        int[] count = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
            if (count[nums[i]] > 1) {
                return nums[i];
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna