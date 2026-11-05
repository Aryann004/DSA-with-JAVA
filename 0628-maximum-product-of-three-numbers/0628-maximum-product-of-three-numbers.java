class Solution {
    public int maximumProduct(int[] A) {
        int n = A.length;
        for (int i = 0; i < 2; i++) {
            int k = i;
            for (int j = i + 1; j < n; j++)
                if (A[j] < A[k]) k = j;
            swap(A, i, k);
        }
        for (int i = n - 1; i >= Math.max(0, n - 3); i--) {
            int k = i;
            for (int j = 0; j < i; j++)
                if (A[j] > A[k]) k = j;
            swap(A, i, k);
        }
        return Math.max(
            A[n - 1] * A[n - 2] * A[n - 3],
            A[n - 1] * A[0] * A[1]
        );
    }
    private void swap(int[] A, int i, int j) {
        if (i != j) {
            A[i] ^= A[j]; A[j] ^= A[i]; A[i] ^= A[j];
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna