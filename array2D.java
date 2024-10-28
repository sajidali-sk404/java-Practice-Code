import java.util.*;

public class array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int row = sc.nextInt();
    
        System.out.print("Enter Columns : ");
        int col = sc.nextInt();
        int[][] number = new int[row][col];
        // input
           //rows
        for(int i = 0; i<row; i++){
             // Columns
            for(int j = 0; j<col; j++){
               number[i][j] = sc.nextInt();

            }

        }
         // OutPut
         for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                System.out.print(number[i][j]+ " ");
            }
            System.out.println();
         }

    }
    
}
