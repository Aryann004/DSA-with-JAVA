class Solution {
    public int maxConsecBits(int[] arr) {
        int l=0,r=0,max=0;
        while(r<arr.length){
            if(arr[l]==arr[r]){
                r++;
            }
            else{
                l++;
            }
            max=Math.max(max,r-l);
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna