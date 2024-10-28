public class pattern8 {
    public static void main(String[] args) {
         // Number Pyramid
         int num = 5;
           
        //  Outer Loop
      for(int i = 1; i<=num ; i++){
         //Spaces
        for(int j = 1;j<=num-i;j++){
            System.out.print(" ");
        }
          // Print Numbers
        for(int k = 1; k<=i; k++){
            System.out.print(i+" ");
        }
        System.out.println();
      }
         
    }
}
