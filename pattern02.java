public class pattern02 {
    public static void main(String[] args) {
        int n = 4;

        // Half pyramid
        // for(int i = 1; i <=n;i++){
        // for(int j = 1;j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println();

        // }

        // Inverted Half pyramid
        // for(int i = n; i >=1;i--){
        // for(int j = 1;j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println();

        // }

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
