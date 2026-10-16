class Solution {
    public ArrayList<Integer> sumTriangles(int mat[][]) {
        // code here
        int n=mat.length;
        int upper_tri=0;
        int lower_tri=0;
        ArrayList<Integer>res=new ArrayList<>();
        for (int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                if(i>=j){
                    lower_tri = lower_tri + mat[i][j];
                }
                if(i<=j){
                    upper_tri = upper_tri + mat[i][j];
                }
            }
        }
        res.add(upper_tri);
        res.add(lower_tri);
        return res;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna