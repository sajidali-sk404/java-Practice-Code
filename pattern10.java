public class pattern10 {
    public static void main(String[] args) {
         // Daimond Pattern

         int num = 4;
             //  First Half
            // Outer Loop
        for(int i = 1;i<=num; i++){
                // Spaces
            for(int j = 1; j<=num-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=2*i-1; k++) {
                System.out.print("*");
            }
             System.out.println();
        }
               //  2nd Half
            // Outer Loop
        for(int i = num;i>=1; i--){
                // Spaces
            for(int j = 1; j<=num-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
