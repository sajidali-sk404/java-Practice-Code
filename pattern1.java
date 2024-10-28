public class pattern1 {
    public static void main(String[] args) {
        int numA = 4;
        int numB = 5;
            // SOLID RECTANGLE
        //     // Outer loop
        // for(int i = 1; i<=numA; i++){
        //     // Inner loop
        //      for(int j = 1; j<=numB; j++){
        //         System.out.print("*");
        //      }
        //     System.out.println();
        // }


            // HOLLOW RECTANGLE
            // Outer loop
        for(int i = 1;i<=numA;i++){
            // Inner Loop
            for(int j = 1;j<=numB;j++){
                if (i==1 || j==1 || i==numA || j==numB) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
