public class pattern3 {
    public static void main(String[] args){
        //  Invarted Half Pyramid (Rotated by 180 deg)
        int num = 4;

         // Outer Loop
         for(int i = 1; i<=num; i++){
            
            for(int j = 1;j<=num-i;j++){
                System.out.print(" ");

            }
                for(int k = 1;k<=i;k++){
                    System.out.print("*");
            }
            System.out.println();
        }

    }
}
