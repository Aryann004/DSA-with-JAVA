class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i <= rowIndex; i++){
            int val = ncr(rowIndex,i);
            ans.add(val);
        }
        return ans;
    }
    public int ncr(int row, int col){
        long res = 1;
        for(int i = 0; i < col; i++){
            res = res * (row - i);
            res = res / (i + 1);
        }
        return (int)res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna