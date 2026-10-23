class Solution {
    public void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        for(int color : nums){
            if(color == 0) red++;
            if(color == 1) white++;
        }
        int p = 0;
        while(red != 0){
            nums[p] = 0;
            p++;
            red--;
        }
        while(white != 0){
            nums[p] = 1;
            p++;
            white--;
        }
        while(p < nums.length){
            nums[p] = 2;
            p++;
        }
}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna