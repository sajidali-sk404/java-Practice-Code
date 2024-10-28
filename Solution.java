import java.util.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        if(n%2!=0){
            System.out.println("Wierd");
        }
          else if(n%2==0 && n>=1 && n<=5){
              System.out.println("Not Weird");
              
          }
          else if(n%2==0 && n>=6 && n<=20){
              System.out.println("Wierd");
          }else{
              System.out.println("Not Wierd");
          }
        

        scanner.close();
    }
}