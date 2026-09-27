class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] count = new int[n + 1];
        for (int i = 0; i < n; i++) {
            count[nums[i]]++;
        }
        int duplicate = 0;
        int missing = 0;
        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                duplicate = i;
            }
            if (count[i] == 0) {
                missing = i;
            }
        }
        return new int[]{duplicate, missing};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna