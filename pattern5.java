public class pattern5 {
    public static void main(String[] args){
         // Floyd's Triangle

        //  int num = 5;
        //  int number = 1;

        //     // Outer Loop
        // for(int i = 1; i<=num ; i++){
        //     //Inner Loop
        //     for(int j = 1; j<=i; j++){
        //         System.out.print(number+" ");
        //         number++;
        //     }
        //     System.out.println();
        // }

                 // 0s ,1s Triangle
            int num = 5;
                // Outer Loop
             for(int i = 1; i<=num; i++) {
                // Inner Loop 
                for(int j = 1; j<=i; j++){
                    int sum = i + j;
                    if(sum%2==0){
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                }
                System.out.println();
             }

    }
}
