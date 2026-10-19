class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 0)
            return false;
        if (num == 0 || num == 1)
            return true;
        int start = 1;
        int end = num /2;
        while(start <= end){
            int mid = start + (end - start) / 2;
            long sq = (long)mid * mid;
            if(sq == num){
                return true;
            }else if(sq < num){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
    return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna