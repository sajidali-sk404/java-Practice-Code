public class pattern4 {
    public static void main(String[] args){
        // // Half Pyramid With Numbers
        // int num = 5;
        //   // Outer Loop
        // for(int i = 1; i<=num; i++){
        //   // Inner Loop
        //   for(int j = 1; j<=i; j++){
        //     System.out.print(j);
        //   }
        //   System.out.println();
        // }

            // Invarted Half Pyramid with numbers
            int num = 5;

             // Outer Loop
         for(int i = num; i>=1; i-- ){
                //Inner Loop
            for(int j = 1 ; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
         }
    }
}
