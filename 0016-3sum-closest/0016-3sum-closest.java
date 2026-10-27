class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int res = nums[0] + nums[1] + nums[2];
        for(int i=0;i<n-2;i++) {
            int l = i+1, r = n-1;
            while(l<r) {
                int s = nums[i] + nums[l] + nums[r];
                if(Math.abs(target-s) < Math.abs(target-res)) {
                    res = s;
                }
                if(s==target) {
                    return s;
                } else if(s < target) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna