class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int left = 0;
            int right = image[i].length - 1;
            while (left <= right) {
                int temp = image[i][left];
                image[i][left] = 1 - image[i][right];
                image[i][right] = 1 - temp;
                left ++;
                right--;
            }
        }
        return image;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna