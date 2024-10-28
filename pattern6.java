public class pattern6 {
    public static void main(String[] args) {
          // ButterFly Pattern
        
        int num = 4;
            // Upper Half
         //Outer Loop
        for(int i = 1; i<=num; i++){
            // Inner Loop 
          for(int j = 1; j<=i; j++){
            System.out.print("*");
          }
            // Spaces
            int Spaces = 2*(num-i);
        for(int k = 1;k<=Spaces;k++){
            System.out.print(" ");
        }
        //    2nd part 
        for(int j =1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
        }
        

          // Lower Half

              //Outer Loop
        for(int i = num; i>=1; i--){
            // Inner Loop 
          for(int j = 1; j<=i; j++){
            System.out.print("*");
          }
            // Spaces
            int Spaces = 2*(num-i);
        for(int k = 1;k<=Spaces;k++){
            System.out.print(" ");
        }
        //    2nd part 
        for(int j =1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
        }
    }
}
