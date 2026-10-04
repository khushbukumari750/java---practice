//(18) REVERSE A CHARACTER ARRAY 

public class ReverseChar {
    public static void main(String[] args) {
        char[]arr = {'H','E','L','L','O'};
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
}

