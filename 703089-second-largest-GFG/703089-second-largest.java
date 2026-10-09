class Solution {
    public int getSecondLargest(int[] arr) {
     int a = arr[0],b=-1;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>a){
                    b=a;
                    a=arr[i];
                }else 
                if(arr[i]>b && arr[i]<a){
                    b=arr[i];
                }
            }
            return b;
         }
     }              

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna