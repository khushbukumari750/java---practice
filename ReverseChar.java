//(18) REVERSE A CHARACTER ARRAY 
// public class ReverseChar {
//     public static void main(String[] args) {
//         char[]arr = {'a','b','c','d'};
//         int left = 0;
//         int right = arr.length-1;
//         while (left < right) {
//             char temp = arr[left];
//             arr[left] = arr[right];
//             arr[right] = temp;
//             left++;
//             right--;
//         }
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }




//(20) USER SE VALUE(INPUT LENA HAI)
import java.util.*;
public class ReverseChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size = ");
        int n = sc.nextInt();
        char[]arr = new char[n];
        System.out.print("Enter the element = ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.next().charAt(0);
        }
        int left = 0;
        int right = arr.length-1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}