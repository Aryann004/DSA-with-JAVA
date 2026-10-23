class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int j = 0, i = m; j < n; j++){
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna