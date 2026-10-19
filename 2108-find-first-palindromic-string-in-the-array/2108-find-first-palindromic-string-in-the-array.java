class Solution {
    public String firstPalindrome(String[] words) {
        for(String word:words){
            String rev = new StringBuilder(word).reverse().toString();
            if(word.equals(rev)){
                return word;
            }
        }
        return "";
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna