public class pattern7 {
    public static void main(String[] args) {
          // Solid Rhombus
          int num = 5;

             //Outer loop
        for(int i= 1; i<=num; i++){
               // Spaces
          for(int j = 1; j<=num-i; j++){
            System.err.print(" ");
          }
            //Inner Loop
          for(int k = 1; k<=num; k++){
            System.out.print("*");
          }
            System.out.println();
        }
    }
}
