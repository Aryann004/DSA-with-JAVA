class Solution {
    public int countWords(String s) {
        // code here
       String st = s.trim();
        if(s.length()==0){
            return 0;
        }
        String[] str = st.split("\\s+");
        return str.length;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna