//(4) CHECK polindrome ARRAY USING TWO POINTER APPORACH

import java.util.*;
public class Polindrome {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the size = ");
        int n = sc.nextInt();
        int[]arr = new int[n];
        System.out.print("Enter the element = ");
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int start = 0;
            int end = arr.length-1;
            boolean polindrome = true;
            while (start < end ) {
                if(arr[start] != arr[end]){
                    polindrome = false;
                    break;
                }
                start++;
                end--;
            }
            if(polindrome){
                System.out.print("It is polindrome ");
            }
            else{
                System.out.print("It is not polindrome ");
            }
        }
    
}
