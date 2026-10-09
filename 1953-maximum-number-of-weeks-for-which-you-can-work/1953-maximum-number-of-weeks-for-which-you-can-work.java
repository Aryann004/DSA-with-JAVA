class Solution {
    public long numberOfWeeks(int[] milestones) {
        long sum = 0, max = 0;
        for (int i = 0; i < milestones.length; i++) {
            sum += milestones[i];
            if (milestones[i] > max) {
                max = milestones[i];
            }
        }
        long rest = sum - max;
        if (max <= rest + 1) {
            return sum;
        }
        return 2 * rest + 1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna