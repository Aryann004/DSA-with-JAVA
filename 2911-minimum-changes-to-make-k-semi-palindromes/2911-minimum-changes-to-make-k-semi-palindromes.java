class Solution {
    public int minimumChanges(String s, int k) {
        int n = s.length();
        final int INF = 1000000000;

        List<Integer>[] divisors = new ArrayList[n + 1];

        for (int d = 0; d <= n; d++) {
            divisors[d] = new ArrayList<>();
        }

        for (int d = 1; d <= n; d++) {
            for (int v = 1; v < d; v++) {
                if (d % v == 0) {
                    divisors[d].add(v);
                }
            }
        }

        int[][] cost = new int[n + 1][n + 1];

        for (int[] row : cost) {
            Arrays.fill(row, INF);
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int L = j - i + 1;
                int best = INF;

                for (int d : divisors[L]) {
                    int changes = 0;

                    for (int start = i; start < i + d; start++) {
                        int l = start;
                        int r = start + ((j - start) / d) * d;

                        while (l < r) {
                            if (s.charAt(l) != s.charAt(r)) {
                                changes++;
                            }

                            l += d;
                            r -= d;
                        }
                    }

                    best = Math.min(best, changes);
                }

                cost[i][j] = best;
            }
        }

        int[][] dp = new int[k + 1][n + 1];

        for (int[] row : dp) {
            Arrays.fill(row, INF);
        }

        dp[0][0] = 0;

        for (int t = 1; t <= k; t++) {
            for (int i = t; i <= n; i++) {
                for (int j = t - 1; j < i; j++) {
                    if (dp[t - 1][j] < INF &&
                        cost[j][i - 1] < INF) {

                        dp[t][i] = Math.min(
                            dp[t][i],
                            dp[t - 1][j] + cost[j][i - 1]
                        );
                    }
                }
            }
        }

        return dp[k][n];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna