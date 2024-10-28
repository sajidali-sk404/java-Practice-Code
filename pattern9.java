public class pattern9 {
    public static void main(String[] args) {
           // Palindromic Pattern
        int num = 5;
          // Outer Loop
        for(int i = 1;i<=num;i++) {

            // Spaces
          for(int j = 1; j<=num-i; j++){
            System.err.print(" ");
        }
            // firt Half
            for(int k = i; k>=1; k--){
                System.out.print(k);
            }
              // 2nd Half
            for(int j = 2;j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
