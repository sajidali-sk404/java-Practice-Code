public class pattern03 {
    public static void main(String[] args) {
            //patern no 6
        // int number = 5;
        // for(int i = 1;i<=number;i++){
        //     for(int j = 1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
                //patern no 7
        //     int number = 5;
        //  for(int i = 1;i<=number;i++){
        //     for(int j = 1;j<=number-i+1;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
                //patern no 8
        //    int number = 1;
        //    int n = 5;
        //  for(int i = 1;i<=n;i++){
        //     for(int j = 1;j<=i;j++){
        //         System.out.print(number+" ");
        //         number++;
        //     }
        //     System.out.println();
        // }

            //patern no 8
            int n = 5;
            for(int i =1;i<=n;i++){
                for(int j= 1; j<=i;j++){
                    int sum = i+j;
                    if(sum % 2 ==0 ){
                        System.out.print("1"+" ");
                    }else{
                        System.out.print("0"+" ");
                    }
                }
                System.out.println();
            }


    }
}
