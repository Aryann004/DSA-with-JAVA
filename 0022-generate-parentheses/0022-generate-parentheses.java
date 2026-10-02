class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        solve("", 0, 0, n, list);
        return list;
    }
    void solve(String s, int open, int close, int n, List<String> list) {

        if (s.length() == 2 * n) {
            list.add(s);
            return;
        }
        if (open < n)
            solve(s + "(", open + 1, close, n, list);
        if (close < open)
            solve(s + ")", open, close + 1, n, list);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna