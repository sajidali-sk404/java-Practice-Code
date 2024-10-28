import java.util.Scanner;

public class BitwiseOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opper = sc.nextInt();
        int n = 5;
        int pos = 2;
        int BitMask = 1<<pos;
                // Update Bit Code
        if(opper ==1) {
            int newNumber = BitMask | n;
            System.out.println(newNumber);
        } else {
            int notBitMask = ~(BitMask);
            int newNumber = notBitMask & n;
            System.out.println(newNumber);
        }



                //  clear Bit Code

        // int notBitMask = ~(BitMask);
        // int newNumber = notBitMask & n;
        // System.out.println(newNumber);
        
                    // Set Bit Code
        // int newNumber = BitMask | n;
        // System.out.println(newNumber);

                    // Get Bit Code
        // if( (BitMask & n) == 0) {
        //     System.out.println("bit was zero ");
        // } else {
        //     System.out.println("bit was not zero ");
        // }
        

    }    
}
