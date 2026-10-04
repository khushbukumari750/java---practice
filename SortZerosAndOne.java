//(1) TWO POINTER APPROACH (Array me Zero ko phle likhna hai or one ko baad me)
// import java.util.*;
// public class SortZerosAndOne {
//   static void SortZerosAndOne(int[]arr){
//         int n = arr.length;
//         int left = 0;
//         int right = n-1;
//         while (left < right) {
//             if(arr[left] == 1 && arr[right] == 0){
//                 int temp = arr[left];
//                 arr [left] = arr[right];
//                 arr [right] = temp;
//                 left++;
//                 right--;
//             }
//             if(arr[left] == 0){
//                 left++;
//             }
//             if (arr[right] == 1) {
//                 right--;
//             }
//         }
//         System.out.println(Arrays.toString(arr));
//     }
//     public static void main(String[] args) {
//         int[]arr = {1,1,0,1,0,0,1,1,0,1,0,1,0,1,0,0,1,0};
//         SortZerosAndOne(arr);
//     }
// }



//(2)ARRAY ME ZERO KO LAST ME KARNA HAI AND ONE KO PAHLE
// import java.util.*;
// public class SortZerosAndOne {
//     static void SortZerosAndOne(int[]arr){
//         int n = arr.length;
//         int left = 0;
//         int right = n-1;
//         while (left<right) {
//             if (arr[left]==0 && arr[right]==1) {
//                 int temp = arr[left];
//                 arr[left] = arr[right];
//                 arr[right] = temp;
//                 left++;
//                 right--;
//             }
//             if(arr[left]==1){
//                 left++;
//             }
//             if(arr[right]==0){
//                 right--;
//             }
//         }
//         System.out.println(Arrays.toString(arr));
//     }

//     public static void main(String[] args) {
//         int[]arr = {1,0,1,1,1,1,0,0,0,0,0,0,0,1};
//         SortZerosAndOne(arr);
//     }
// }





