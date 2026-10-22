// class Solution {
//     public int findContentChildren(int[] g, int[] s) {
//          Arrays.sort(g);
//          Arrays.sort(s);
//          int i=0;
//          int j =0;
//          int count =0;
//          while (i<g.length && j<s.length){

//             if(s[j]>=g[i]){
//                 count ++;
//                 i++;
//             }
//             j++;
//          }
//          return count;
//     }
// }
class Solution {
    public int findContentChildren(int[]g,int[]s){
        int cookiesNums= s.length;
        if(cookiesNums ==0)
        return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int maxNum =0;
        int cookieIndex = cookiesNums -1;
        int childIndex = g.length -1;
        while(cookieIndex >= 0 && childIndex >= 0){
            if(s[cookieIndex] >= g[childIndex]){
                maxNum++;
                cookieIndex--;
                childIndex--;
            }
            else{
                childIndex--;
            }
        }
        return maxNum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna