class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int mid = n/2;
        String vowels = "aeiouAEIOU";
        int i=0;
        int j = mid;
        int left =0;
        int right = 0;
        while(i<mid && j<n){
            if(vowels.indexOf(s.charAt(i)) != -1){
                left ++;
            }
            if(vowels.indexOf(s.charAt(j)) !=-1){
                right++;
            }
            i++;
            j++;
        }
        return left == right;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna