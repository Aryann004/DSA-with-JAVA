import java.util.*;
class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> ans = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        Set<String> set = new HashSet<>();
        q.add(s);
        set.add(s);
        while (!q.isEmpty()) {
            String x = q.poll();
            if (valid(x))
                ans.add(x);
            if (!ans.isEmpty()) continue;
            for (int i = 0; i < x.length(); i++) {
                if (x.charAt(i) == '(' || x.charAt(i) == ')') {
                    String y = x.substring(0, i) + x.substring(i + 1);
                    if (set.add(y)) q.add(y);
                }
            }
        }
        return ans;
    }
    boolean valid(String s) {
        int c = 0;
        for (char x : s.toCharArray()) {
            if (x == '(') c++;
            if (x == ')' && --c < 0) return false;
        }
        return c == 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna