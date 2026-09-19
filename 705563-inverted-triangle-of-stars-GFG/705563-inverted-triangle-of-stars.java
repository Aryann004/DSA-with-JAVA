import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // code here
        for(int i = 0; i < n; i++){
                    for(int j = 0; j<i;j++){
                        System.out.print(" ");
                    }
                    for(int k= 0; k< n-i; k++){
                    System.out.print("*");
                }
                for(int l =0; l< n-i-1;l++){
                    System.out.print("*");
                }
                System.out.println();
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna