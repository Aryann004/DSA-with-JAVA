class Solution {
    public int findContentChildren(int[] g, int[] s) {
         Arrays.sort(g);
         Arrays.sort(s);
         int i=0;
         int j =0;
         int count =0;
         while (i<g.length && j<s.length){

            if(s[j]>=g[i]){
                count ++;
                i++;
            }
            j++;
         }
         return count;
    }
    }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna