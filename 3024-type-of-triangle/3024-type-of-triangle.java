class Solution {
    public String triangleType(int[] nums) {
        for (int i = 0; i < 3; i++) {
            if (nums[i] >= nums[(i + 1) % 3] + nums[(i + 2) % 3]) {
                return "none";
            }
        }
        if (nums[0] == nums[1] && nums[1] == nums[2]) {
            return "equilateral";
        }
        if (nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) {
            return "isosceles";
        }
        return "scalene";
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna