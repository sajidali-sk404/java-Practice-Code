

public class Recursion2 {
    public static String[] keypad = {".","abc","def","ghi","jul","mno","pqrs","tu","vwx","yz"};
    public static void printComb(String str, int idx, String combination) {
        if(idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - 'o'];

        for(int i = 0; i<mapping.length(); i++) {
            printComb(str, idx+1, combination + mapping.charAt(i));
        }
    }
            /// Subsequences Same elements
    // public static void subsequencesSame(String str, int idx, String newString, HashSet<String>) {
    //     if(idx == str.length()) {
    //         if(Set.contains(newString)) {
    //             return;
    //         }
    //     }

    //     char currChar = str.charAt(idx);
    //       // to be
    //     subsequences(str, idx+1, newString + currChar);
    //     // or not to be 
    //     subsequences(str, idx+1, newString);

    // }


//             // Subsequences Same elements
//     public static void subsequences(String str, int idx, String newString) {
//         if(idx == str.length()) {
//             System.out.println(newString);
//             return;
//         }
//         char currChar = str.charAt(idx);
//         // to be
//         subsequences(str, idx+1, newString + currChar);
//         // or not to be 
//         subsequences(str, idx+1, newString);
//     }

//             // Remove Duplicates
// public static boolean[] map = new boolean[26];
// public static void removeDuplicates(String str, int idx, String newString) {
//     if(idx == str.length()) {
//         System.out.println(newString);
//         return;
//     }
//     char currChar = str.charAt(idx);
//     if(map[currChar - 'a']) {
//         removeDuplicates(str, idx+1, newString);
//     } else {
//         newString += currChar;
//         map[currChar- 'a'] = true;
//         removeDuplicates(str, idx+1, newString);
//     }
// }



//             // Move All X end
//     public static void moveAllX(String str,int idx,int count,String newString) {
//         if(idx == str.length()) {
//             for(int i = 0; i<count; i++){
//                 newString += 'x';
//             }
//             System.out.println(newString);
//             return;
//         }
//         char currChar =str.charAt(idx);
//         if(currChar == 'x') {
//             count++;
//             moveAllX(str, idx+1, count, newString);
//         }else {
//             newString +=currChar;
//             moveAllX(str, idx+1, count, newString);
//         }
//     }
//             /// Sorted Array
//     public static boolean issorted(int[] arr, int idx ) {
//         if(idx == arr.length-1) {
//             return true;
//         }

//         if(arr[idx] < arr[idx+1]) {
//             return issorted(arr, idx+1);
//         } else {
//             return false;
//         }
//     }

//             /// Find Occurence 
//     public static int  first;
//     public static int  last;
//     public static void findOccurence(String str, int idx, char element) {
//         if(idx == str.length()) {
//             System.out.println(first);
//             System.out.println(last);
//             return;

//         }
        
//         char currChar = str.charAt(idx);
//         if(first == -1) {
//             first = idx;
//         } else {
//             last = idx;
//         }
//         findOccurence(str, idx+1, element);
//     }

//                     /// Print String Reverse
//     public static void printReverse(String str, int idx) {
//         if(idx == 0) {
//             System.out.println(str.charAt(idx));
//             return;
//         }

//         System.out.println(str.charAt(idx));
//         printReverse(str, idx-1);

//     }

//             /// Tower Of Hanoi    // Time complexity  O(2n);
//     public static void towerOfHanoi(int n, String src, String helper, String dest) {
//         if(n == 1){
//          System.out.println("Transfer Disk "+n+" from "+src+" to "+dest);
//          return;

//         }

//         towerOfHanoi(n-1, src, dest, helper);
//         System.out.println("Transfer Disk "+n+" from "+src+" to "+dest);
//         towerOfHanoi(n-1, helper, src, dest);
//     }






    public static void main(String[] args) {
        // int n = 3;
        // towerOfHanoi(n, "S", "H", "D");


        // String str = "abcd";
        // printReverse(str, str.length()-1);

        // String str = "abaacdaefaah" ;
        // findOccurence(str, 0, 'a');

        // int arr[] = {1,3,3};
        // System.out.println(issorted(arr, 0));

        // String str = "abc";
        // subsequences(str, 0, "");

        // HashSet<String> set = new HashSet<>();
        // String str = "aaa";
        // subsequencesSame(str, 0, "");

        String str = "23";
        printComb(str, 0, "");
    }    
}
