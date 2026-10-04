//(17) FIND COMMON ELEMENT IN TWO ARRAYS

import java.util.Arrays;
public class CommonElement {
    public static void main(String[] args) {
        int[]arr1 = {1,2,3,15,4,20,5};
        int[]arr2 = {3,44,5,6,1,7,4,20};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0;
        int j = 0;
        while (i<arr1.length && j<arr2.length) {
            if(arr1[i] == arr2[j]){
            System.out.println(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }

    }
}
