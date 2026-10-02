class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        return words[words.length - 1].length();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna