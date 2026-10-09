class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0, sum = 0;
        int[] rem = new int[k];

        rem[0] = 1;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int r = ((sum % k) + k) % k;

            count += rem[r];
            rem[r]++;
        }

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna