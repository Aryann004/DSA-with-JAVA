class Solution {
    public void sumArray(int[] arr) {
        // code here
        int sum =0;
        for(int i=0; i<arr.length;i++){
            sum = sum + arr[i];
        }
        for(int i =0;i<arr.length;i++){
            arr[i] = sum - arr[i];
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna