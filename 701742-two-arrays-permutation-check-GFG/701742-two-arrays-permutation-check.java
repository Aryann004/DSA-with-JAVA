class Solution {
    public boolean checkPermutation(int[] a, int[] b) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i =0; i < a.length;i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna