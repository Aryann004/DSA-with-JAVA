class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans = 0;
        for(String sentence : sentences){
            int currlength = sentence.split(" ").length;
            if(currlength > ans){
                ans = currlength;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna