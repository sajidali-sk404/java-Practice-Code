public class Recursion1 {
    public static int calcPowerHight(int x,int n) {
        if(n == 0){
            return 1;
        }
        if(x == 0) {
            return 1;
        }

        if(n%2==0) {
            return calcPowerHight(x, n/2) * calcPowerHight(x, n/2);
        } else {
            return calcPowerHight(x, n/2) * calcPowerHight(x, n/2)*x;
        }

    }

    public static int calcPower(int x,int n) {
        if(n == 0){
            return 1;
        }
        if(x == 1) {
            return 0;
        }

        int xpowerNm1 = calcPower(x, n-1);
        int xpown = x * xpowerNm1;
        return xpown;
    }

    public static void calcFibo(int a, int b, int n) {
        if(n == 0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        calcFibo(b, c, n-1);

    }


            // Calculate Factorial

    // public static int calcFactorial(int n) {
    //     if(n == 0 || n == 1) {
    //         return 1;
    //     }

    //     int facNm1 = calcFactorial(n-1);
    //     int fact_n = n*facNm1;
    //     return fact_n;
    // }
  

    //           Print Sum the natural number
    // public static void PrintSum(int i, int n, int sum) {
    //     if(i == n){
    //         sum += i;
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum += i;
    //     PrintSum(i+1, n, sum);
    // }

  
  
  
    // public static void printNumber(int n) {

    
        //     if(n==6) {
        //         return;
        //     }
        //     System.out.println(n);
        //     printNumber(n+1);

        // Print number 5 to 1
    //     if(n==0){
            
    //         return;
    //     }
    //     System.out.println(n);
    //     printNumber(n-1);
    // }
    
    public static void main(String[] args) {

        int x = 2, n = 4;
        int ans = calcPowerHight(x, n);
        System.out.println(ans);

        // int a = 0, b = 1;
        // int n = 7;
        // System.out.println(a);
        // System.out.println(b);
        // calcFibo(a, b, n-2);
        
    }   
}
