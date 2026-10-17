import java.util.*;

class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int[] sorted = nums.clone();
        Map<Integer, Integer> map = new HashMap<>();

        Arrays.sort(sorted);

        for (int x : nums) {
            int sum = 0, t = x;
            while (t > 0) {
                sum += t % 10;
                t /= 10;
            }
            map.put(x, sum);
        }

        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++)
            arr[i] = nums[i];

        Arrays.sort(arr, (a, b) -> {
            if (!map.get(a).equals(map.get(b)))
                return map.get(a) - map.get(b);
            return a - b;
        });

        Map<Integer, Integer> pos = new HashMap<>();
        for (int i = 0; i < n; i++)
            pos.put(arr[i], i);

        int swaps = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i] || pos.get(nums[i]) == i)
                continue;

            int j = i, count = 0;

            while (!visited[j]) {
                visited[j] = true;
                j = pos.get(nums[j]);
                count++;
            }

            swaps += count - 1;
        }

        return swaps;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna