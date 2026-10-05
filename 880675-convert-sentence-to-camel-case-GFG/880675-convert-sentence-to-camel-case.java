class Solution {
    public String convertToCamelCase(String s) {
        String[] str = s.split("\\s+");
        StringBuilder sb =new StringBuilder();
        sb.append(str[0]);
        for (int i =1;i <str.length;i++){
        sb.append(Character.toUpperCase(str[i].charAt(0)));
        sb.append(str[i].substring(1));
        }
        return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna