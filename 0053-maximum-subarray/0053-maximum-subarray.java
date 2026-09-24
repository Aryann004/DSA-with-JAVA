class Solution {
    public int maxSubArray(int[] nums) {
       // int ans = Integer.MIN_VALUE;
       // int n = nums.length;
        //for (int i = 0; i<n;i++){
          //  int sum =0;
            //for(int j = i; j<n;j++){
              ///  sum = sum + nums[j];
                //ans = Math.max(ans,sum);
            //}
        //}
        //return ans;
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i<nums.length;i++){
            if(sum < 0){
                sum = 0;
            }
            sum+= nums[i];
            ans = Math.max(ans,sum);
            }
        return ans;
        }
        }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna