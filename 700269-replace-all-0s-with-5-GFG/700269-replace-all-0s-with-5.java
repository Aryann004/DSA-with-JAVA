class Solution {
    public int convertFive(int n) {
        // code here
        int final_result = 0;
        int fr = 0;
        if(n==0){
            return 5;
        }
        while(n>0){
            int last_digit = n%10;
            if(last_digit==0){
                last_digit = 5;
            }
            final_result = final_result*10+last_digit;
            n=n/10;
        }

        while(final_result>0){
            int ld= final_result%10;

            fr = fr*10+ld;
            final_result=final_result/10;
        }
        return fr;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna