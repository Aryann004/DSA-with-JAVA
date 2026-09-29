class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        while(low<high){
            int mid = low +(high -low)/2;
            if(nums[mid] < nums[mid+1]){
                low = mid +1;
            }
            else {
                high = mid;
            }
        }
        return low;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna