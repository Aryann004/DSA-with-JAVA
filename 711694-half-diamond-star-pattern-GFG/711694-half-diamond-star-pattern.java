import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        for(int row = 0; row < n; row++){
            for(int col = 0; col <=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = n; i > 1; i--){
            for(int j = 1; j<= i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna