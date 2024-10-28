public class pattern2 {
    public static void main (String[] args){
        int num = 4;

            // HALF PYRAMID
        // //Outer Loop
        // for(int i = 1; i<= num;i++){
        //     // Inner Loop
        //     for(int j = 1; j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
            // Inverted Half Pyramid
                // Outer Loop
        for(int i = num; i>=1 ; i--){
                // Inner Loop
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
