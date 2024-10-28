import java.util.*;
public class functions {
            // Question no 3
    // public static void camparison(int a,int b){
    //     if(a>b) {
    //         System.out.println("A greather than B : "+a);
    //     } else {
    //         System.out.println("B greather than A : "+b);
    //     }
    // }
                // Redius Of Cercle
    // public static double rediusOfCercle(double redius){
    //     double circumference = 2 * 3.14 * redius;
    //     return circumference;
    // }

        //        // Question no 6;
        // public static void voteEligibility(int age) {
        //         if(age >= 18) {
        //             System.out.println("You are Eligible for Vote ");
        //         } else {
        //             System.out.println("You are not Eligible for Vote");
        //         }
        // }

                    // question no 7

            // public static double calculatePower(int x,int n){
            //         double result = Math.pow(x, n);
            //     return result;
            // }

                        
                  // Question no 9;
            // public static void commonDivisor(int x, int y){
            //     int GDC = 0;
            //     for(int i = 1; i <= x && i<=y ; i++){
            //         if(x%i==0 && y%i==0){ GDC = i;}

            //     }
            //      System.out.println("GDC : "+ x+" and "+ y +" : "+GDC);

            // }
                public static void fibonacci(int num){
                    int num1 = 0;
                    int num2 = 1;
                    int counter = 0;

                    while (counter<num) {
                        System.out.print(num1+" ");

                        int num3 = num1 + num2;
                        num1 = num2;
                        num2 = num3;
                        counter++;
                    }
                }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            // Question no 3
        // int a = sc.nextInt();
        // int b = sc.nextInt();\
        // camparison(a, b);
                // Redius Of Cercle
        // double redius = sc.nextDouble();
        // System.out.println(rediusOfCercle(redius));

                  // Question no 6;
        // int age = sc.nextInt();
        // voteEligibility(age);

        
                  // Question no 7;
        // int x = sc.nextInt();
        // int n = sc.nextInt();
        // System.out.println(calculatePower(x, n));

         
                  // Question no 9;
            
        //     int x = sc.nextInt();
        //     int y = sc.nextInt(); 
        //  commonDivisor(x, y);

         int num = sc.nextInt();
         fibonacci(num);
}
}