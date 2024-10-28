import java.util.*;

public class Main {
	      
        	// Enter 3 numbers from the user & make a function to print thier average ?

	// public static double average(int numA, int numB,int numC) {
		
	// 	return (numA + numB + numC )/ 3;
	// }
		// Write a function to print the sum of all odd numbers from 1 to n
		public static void sumOdd(int num) {
			int sum =0;
			for(int i = 1; i<=num; i++){
				
				if(i%2 != 0){
					 sum += i;
				}
				
			}
			System.out.println(sum);
			
		}



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// int numA = sc.nextInt();
		// int numB = sc.nextInt();
		// int numC = sc.nextInt();

		// System.out.println(average(numA, numB, numC));
      
		int num = sc.nextInt();
		sumOdd(num);

}
}
