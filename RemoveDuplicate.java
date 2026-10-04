//(13) REMOVE DUPLICATES FROM SORTED ARRAY 

// public class RemoveDuplicate {
//     public static void main(String[] args) {
//         int[]arr = {1,1,2,2,3,4,4,5,5,6};
//         int j = 0;
//         int n = arr.length;
//         for(int i=1; i<n; i++){
//             if(arr[i] != arr[j]){
//                 j++;
//                 arr[j] = arr[i];
//             }
//         }
//         for(int i=0; i<=j; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }



// (14)  REMOVE DUPLICATE FROM UNSORTED ARRAY 
// import java.util.Arrays;
// public class RemoveDuplicate {
// public static void removeDuplicate(int[]arr){
//     Arrays.sort(arr);
//     int j = 0;
//     for(int i=1; i<arr.length; i++){
//         if(arr[i] != arr[j]){
//             j++;
//             arr[j] = arr[i];
//         }
//     }
//     for(int i=0; i<=j; i++){
//         System.out.print(arr[i] + " ");
//     }
// }
//     public static void main(String[] args) {
//         int[]arr = {1,1,2,2,5,5,1,3,2,5,8,3,9,1};
//         removeDuplicate(arr);
//     }
// }



//(15) REMOVE DUPLICATE FROM UNSHORTED ARRAY IN CHARACTOR 
import java.util.*;
public class RemoveDuplicate {
public static void removeDuplicate(char[]arr){
    int n = arr.length;
    int j = 0;
    Arrays.sort(arr);
    for(int i=1; i<n; i++){
        if(arr[j] != arr[i]){
            j++;
            arr[j] = arr[i];
        }

    }
    for(int i=0; i<=j; i++){
        System.out.println(arr[i] + " ");
    }
}
    public static void main(String[] args) {
        char[]arr = {'a','b','h','a','g','h','b','a','g','h'};
        removeDuplicate(arr);
    }
}