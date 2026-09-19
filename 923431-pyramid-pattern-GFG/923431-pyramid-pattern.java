import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k= 1; k<=2*i-1; k++){
            System.out.print("*");
        }
        System.out.println();
        
        }
        sc.close();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna