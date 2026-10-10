class Solution {
    public int countKdivPairs(int[] arr, int k) {
        // int[] freq = new int[k];
        // int count = 0;
        // for (int num : arr) {
        //     int rem = num % k;
        //     int need = (k - rem) % k;
        //     count = count + freq[need];
        //     freq[rem]++;
        // }
        // return count;
        int n = arr.length;
        Map<Integer,Integer>map = new HashMap<>();
        int ans =0;
        for(int val :arr){
            int rem = val%k;
            int req= (k-rem)%k;
            ans = ans + map.getOrDefault(req,0);
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna