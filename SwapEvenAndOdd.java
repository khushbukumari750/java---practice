//(8) SWAP EVEN AND ODD NUMBER (EVEN NUMBER IS FIRST AND ODD NUMBER IS LAST)
// import java.util.*;
// public class SwapEvenAndOdd {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size = ");
//         int n = sc.nextInt();
//         int[]arr = new int[n];
//         System.out.print("Enter the element = ");
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         int i = 0;
//         int j = n-1;
//         while (i < j) {
//             if(arr[i]%2 == 0){
//                 i++;
//             }
//             else if (arr[j]%2 != 0) {
//                 j--;
//             }
//             else{
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//                 i++;
//                 j--;
//             }
//         }
//         for(int k=0; k<n; k++){
//             System.out.print(arr[k] + " ");
//         }
//     }
// }




//(9) SWAP ODD NUMBER AND EVEN NUMBER (ODD NUMBER IS FIRST AND EVEN NUMBER IS LAST)
// import java.util.*;
// public class SwapEvenAndOdd {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size = ");
//         int n = sc.nextInt();
//         int[]arr = new int[n];
//         System.out.print("Enter the element = ");
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         int i = 0;
//         int j = n-1;
//         while (i < j) {
//             if(arr[i] %2 != 0){
//                 i++;
//             }
//              else if(arr[j] %2 == 0){
//                 j--;
//             }
//             else{
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//                 i++;
//                 j--;
//             }
//         }
//         for(int k=0; k<n; k++){
//             System.out.print(arr[k] + " ");
//         }
//     }
// }



//(10) FIND PAIR WITH GIVEN SUM .GIVEN A SORTED ARRAY .FIND WHETHER TWO ELEMENTS HAVVE THE GIVEN SUM
// public class SwapEvenAndOdd {

//     public static void main(String[] args) {
//         int[]arr = {2,1,5,7,8,9,3,6};
//         int n = arr.length;
//         int sum = 10;
//         int i = 0;
//         int j = n-1;
//         while (i < j) {
//             int CurrectSum = arr[i] + arr[j];
//             if(CurrectSum == sum ){
//                 System.out.print(arr[i] + " + " + arr[j] + " = " + sum);
//                 break;
//             }
//             else if (CurrectSum < sum){
//                 i++;
//             }
//             else{
//                 j--;
//             }
//         }
//     }
// }




//(11) FIND PAIR OF GIVEN DIFFERENCE SORTED ARRAY 

// public class SwapEvenAndOdd {
// public static void main(String[] args) {
//     int[]arr = {2,1,5,7,8,10,3,6};
//     int n = arr.length;
//     int diff = 4;
//     int i = 0;
//     int j = n-1;
    
//     while (i < j ) {
//         int CurrectDiff = arr[i] - arr[j];
//         if(CurrectDiff == diff){
//             System.out.print(arr[i] + " - " + arr[j] + " = " + diff);
//             break;
//         }
//         else if(CurrectDiff < diff){
//             i++;
//         }
//         else{
//             j--;
//         }
//     }
// }
// }




//(12) FIND PAIR WITH GIVEN SUM ALL PAIRS 
public class SwapEvenAndOdd {
public static void main(String[] args) {
    int[]arr = {1,2,3,4,5,6};
    int sum = 7;
    int i = 0;
    int j = arr.length-1;
    while (i < j ) {
        int CurrectSum = arr[i] + arr[j];
        if(CurrectSum == sum){
            System.out.println(arr[i] + " + " + arr[j] + " = " + sum);
            i++;
            j--;
        }
        else if(CurrectSum < sum){
            i++;
        }
        else{
            j--;
        }
    }
}
}