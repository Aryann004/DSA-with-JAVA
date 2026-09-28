class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] seen = new boolean[nums.length + 1];
        for (int num : nums) {
            seen[num] = true;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!seen[i]) {
                ans.add(i);
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna