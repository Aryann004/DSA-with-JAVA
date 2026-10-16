//class Solution {
 //   public List<List<Integer>> generate(int numRows) {
//         if (numRows == 0) return new ArrayList<>();
//         if (numRows == 1) {
//             List<List<Integer>> result = new ArrayList<>();
//             result.add(Arrays.asList(1));
//             return result;
//         }
        
//         List<List<Integer>> prevRows = generate(numRows - 1);
//         List<Integer> newRow = new ArrayList<>();
        
//         for (int i = 0; i < numRows; i++) {
//             newRow.add(1);
//         }
        
//         for (int i = 1; i < numRows - 1; i++) {
//             newRow.set(i, prevRows.get(numRows - 2).get(i - 1) + prevRows.get(numRows - 2).get(i));
//         }
        
//         prevRows.add(newRow);
//         // return prevRows;
//     }
// }
import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(ans.get(i - 1).get(j - 1)
                            + ans.get(i - 1).get(j));
                }
            }
            ans.add(row);
        }
        return ans;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna