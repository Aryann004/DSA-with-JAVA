class Solution {
    public int prefixCount(String[] words, String pref) {
        int c= 0;
        int n = pref.length();
        for(String w : words){
            if(w.length()>= n && w.startsWith(pref)){
                c++;
            }
        }
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna