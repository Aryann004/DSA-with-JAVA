class Solution {
     public int firstUniqChar(String s) {
        int ans = Integer.MAX_VALUE;
        for(char c='a'; c<='z';c++){
            int index = s.indexOf(c);
            if(index!=-1&&index==s.lastIndexOf(c)){
                ans = Math.min(ans,index);
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }   
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna