import java.util.Arrays;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] temp = new int[nums1.length];
        int count = 0;
        int i = 0;
        while (i < nums1.length) {
            int j = 0;
            boolean found = false;
            while (j < nums2.length) {
                if (nums1[i] == nums2[j]) {
                    found = true;
                    break;
                }
                j++;
            }
            int x = 0;
            boolean duplicate = false;
            while (x < count) {
                if (temp[x] == nums1[i]) {
                    duplicate = true;
                    break;
                }
                x++;
            }
            if (found && !duplicate) {
                temp[count] = nums1[i];
                count++;
            }
            i++;
        }
        return Arrays.copyOf(temp, count);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna