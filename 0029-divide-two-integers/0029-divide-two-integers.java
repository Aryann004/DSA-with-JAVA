class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        long[] arr = new long[32];
        long[] count = new long[32];
        arr[0] = b;
        count[0] = 1;
        for (int i = 1; i < 32; i++) {
            arr[i] = arr[i - 1] + arr[i - 1];
            count[i] = count[i - 1] + count[i - 1];
            if (arr[i] > a) {
                break;
            }
        }
        long answer = 0;
        for (int i = 31; i >= 0; i--) {
            if (arr[i] <= a) {
                a = a - arr[i];
                answer = answer + count[i];
            }
        }
        if ((dividend < 0) != (divisor < 0)) {
            answer = -answer;
        }
        return (int) answer;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna