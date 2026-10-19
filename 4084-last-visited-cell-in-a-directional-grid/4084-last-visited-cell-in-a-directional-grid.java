class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int previ=0,prevj=0,i=0,j=0;
        while(i>=0 && j>=0 && i<grid.length && j<grid[0].length && grid[i][j]!='$'){
            previ=i;
            prevj=j;
            if(grid[i][j]=='L') j--;
            else if(grid[i][j]=='R') j++;
            else if(grid[i][j]=='U') i--;
            else if(grid[i][j]=='D') i++;
            grid[previ][prevj]= '$';
        }
        return new int[]{previ,prevj};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna