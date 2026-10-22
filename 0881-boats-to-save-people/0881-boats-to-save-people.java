class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int count = 0;
        int i =0;
        int j = people.length - 1;
        while (i<=j){
            if(people[i]+ people[j]<=limit){
                i++;
                j--;
            }else {
                j--;
            }
            count++;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna