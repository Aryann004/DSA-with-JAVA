import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{')
                st.push(c);
            else {
                if (st.empty()) return false;
                char x = st.pop();
                if (c == ')' && x != '(' ||
                    c == ']' && x != '[' ||
                    c == '}' && x != '{')
                    return false;
            }
        }
        return st.empty();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna