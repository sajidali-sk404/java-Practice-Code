import java.util.*;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();
        System.out.println();
        System.out.print("Enter find Value : ");
        int x = sc.nextInt();
        
        int[] marks = new int[size];

        for(int i = 0; i<size; i++){
         marks[i] = sc.nextInt();
            
        }
        // marks[0] = 98;
        // marks[1] = 95;
        // marks[2] = 92;

        // System.out.println("marks :"+marks[0]);
        // System.out.println("marks :"+marks[1]);
        // System.out.println("marks :"+marks[2]);

        for(int i = 0;i<size;i++){
            if(marks[i]==x)
            System.out.println("found x in location : ("+ i +")"+ " marks "+marks[i]);
        }
    }
}
