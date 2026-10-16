class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        // code Here
        int n = arr.length;
        Arrays.sort(arr);
        for(int i =0; i <n-2;i++){
            int left = i +1;
            int right = n-1;
            while(left<right){
                int currentSum = arr[i] + arr[left] + arr[right];
                if(currentSum == target){
                    return true;
                }else if (currentSum<target){
                    left ++;
                }else {
                    right--;
                }
                 
            }
        }
        return false;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna