class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice,
                                 String arriveBob, String leaveBob) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int a1 = convert(arriveAlice, days);
        int a2 = convert(leaveAlice, days);
        int b1 = convert(arriveBob, days);
        int b2 = convert(leaveBob, days);
        return Math.max(0, Math.min(a2, b2) - Math.max(a1, b1) + 1);
    }
    private int convert(String date, int[] days) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3));
        for (int i = 0; i < month - 1; i++) {
            day += days[i];
        }
        return day;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna