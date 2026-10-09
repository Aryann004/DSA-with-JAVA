class Solution {
    public static boolean isPalindrome(int[] arr) {
        int left=0;
        int right=arr.length-1;

        while(left<right){
            if(arr[left++]!=arr[right--]){
                return false;
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna