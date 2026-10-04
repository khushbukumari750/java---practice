//(41)
// import java.util.Scanner;

// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int rows = sc.nextInt();
//         int cols = sc.nextInt();
//         int [][] numbers = new int [rows][cols];
//         for(int i = 0; i<rows; i++){
//             for(int j = 0; j<cols; j++){
//                 numbers[i][j] = sc.nextInt();
//             }
//         }
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols; j++){
//                 System.out.print(numbers[i][j]+" ");
//             }
//             System.out.println();
//         }

//     }
// }


//(42)
// public class Array {
// public static void main(){
// int arr [];
//     arr = new int[5];
//     int brr[] ={10,20,30,40,50};
//     System.out.println("Value at 0 index = "+ brr[0]);
//     System.out.println("Value at 1 index = "+ brr[1]);
//     System.out.println("Value at 2 index = "+ brr[2]);
//      System.out.println("Value at 3 index = "+ brr[3]);
//     System.out.println("Value at 4 index = "+ brr[4]);
// }
// }


//(43)
// public class Array {

//     public static void main() {
//         int arr [];
//         arr = new int[5];
//         int brr[] = {10,20,30,40,50};
//         int n = brr.length;
//         for(int index = 0; index<=n-1; index++){
//             System.out.println(brr[index]);
//         }
//     }
// }


//(44)

// import java.util.Scanner;

// public class Array {
// public static void main(){
//     int arr[] = new int[5];
//     Scanner sc = new Scanner(System.in);
//     int n = arr.length;
//     for(int i=0; i<=n-1; i++){
//         System.out.println("Provide input for index " + i);
//         arr[i] = sc.nextInt();

//     }
//     System.out.println("you array contain = ");
//     for(int val:arr){
//         System.out.println(val);
//     }
// }
// }



//(45) array ki sare value ko sum karnan hai
// public class Array {

//     public static void main(){
//         int arr[] = {10,20,30,40,50,60};
//         int sum = 0;
//         int n = arr.length;
//         for(int i =0; i <= n-1; i++){
//             int Value = arr[i];
//             sum = sum+Value;
//         }
//         System.out.println(sum);
//     }
// }


//(46)multiplication of array
// public class Array {

//     public static void main(){
//         int arr[] = {2,4,6,4,5};
//         int mul = 1;
//         int n = arr.length;
//         for(int i =0; i<=n-1; i++){
//             int value = arr[i];
//             mul = mul*value;
//         }
//         System.out.println(mul);
//     }
// }


//(47)subtraction of arr
// public class Array {

//     public static void main(){
//         int arr[] = {22,4};
//         int sub = arr[0];
//         int n = arr.length;
//         for(int i=1; i<n; i++){
//             int value = arr[i];
//             sub = sub-value;
//         }
//         System.out.println(sub);
//     }
// }


//(48)find the max value
// public class Array {

//     public static void main(){
//         int arr[] = {2,5,7,4,1};
//         int n = arr.length;
//         int maxValue = arr[0];
//         for(int i=0; i<n; i++){
//             if(arr[i] > maxValue){
//                 maxValue = arr[i];
//             }
//         }
//         System.out.println(maxValue);
//     }
// }


//(49)find the min value
// public class Array {

//     public static void main(){
//         int arr[] = {5,3,1,7,8,9};
//         int n = arr.length;
//         int minValue = arr[0];
//         for(int i=0; i<n; i++){
//             if(arr[i]<minValue){
//                 minValue = arr[i];
//             }
//         }
//         System.out.println(minValue);
//     }
// }



//(50)replace the number
// public class Array {

//     public static void main(String[]args){
//         int[] arr = {11,33,66,32,22,99};
//         int x = 10;
//         System.out.println(arr[3]);
//         arr[3]=55;
//         System.out.println(arr[3]);
//     }
// }
    

//(51)pura array print karna hai
// public class Array {

//     public static void main(String[] args) {
//         int arr[] = {34,65,47,36,2,7,445};
//         for(int i = 0; i<=6; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }



//(52)
// import java.util.*;
// public class Array {

//     public static void main(String[] args) {
//         int arr[] = {22,1,3,5,4,9,88,77,66,9,8,7,54,3,52,5,7,54,25,75,6};
//         int n = arr.length;
//         for(int i=0; i<n; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }


//(53)
// import java.util.Scanner;

// public class Array {
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter Array Size = ");
//     int n = sc.nextInt();
//     int[]arr = new int[n];
//     System.out.println("Enter Array Element = ");
//     for(int i=0; i<n; i++){
//         arr[i] = sc.nextInt();
//     }
//     for(int i=0; i<n; i++){
//         System.out.print(arr[i] + " ");
//     }
// }
// }


//(54)give an array of marks of students if the mark of any student is less than 35 peint its roll number 
// public class Array {

//     public static void main(String[] args){
//         int[] marks = {100,88,25,33,22,11,15,44,55,28,99,64,27,36};
//         for(int i=0; i<marks.length; i++){
//             if(marks[i]<35);
//             System.out.print(i+" ");
//         }
//     }
// }


//(55)
// public class Array {
// public static void main(String[] args) {
//     int[]marks = {2,4,9,1,6,33,44,55,22,8,5};
//     for(int i=0; i<marks.length; i++){
//         if(marks[i]<10){
//         System.out.println(marks[i] + " ");
//         }
//     }
// }
// }



//(56)sum of array
// public class Array {
// public static void main(String[] args) {
//     int []marks = {4,5,2,7,9,11,44,22};
//     int sum = 0;
//     for(int i=0; i<marks.length; i++){
//         sum += marks[i];
//     }
//     System.out.println(sum);
// }
// }


//(57)find second maxvalue
// public class Array {

//     public static void main(String[] args) {
//         int arr[] = {2,4,7,9,11,33,8};
//         int n = arr.length;
//         int maxValue = arr[0];
//         for(int i=0; i<=n-1; i++){
//             if(maxValue<arr[i]){
//                 maxValue = arr[i-1];
//             }
//         }
//         System.out.println(maxValue);
//     }
// }



//(58) find second minimum number
// public class Array {
//     public static void main(String[] args) {
//         int arr[] = {9,4,56,8,6,44,55,11,22};
//         int min=arr[0];
//         int smin=arr[1];
//     for(int i=0;i<arr.length;i++){
//        if(min>arr[i]){
//         smin=min;
//         min=arr[i];
        
//        }
//        if(min!=arr[i]&&smin>arr[i]){
//         smin=arr[i];
//        }
//     }
//     System.out.println("min"+min);

//     System.out.println("Second minimum="+smin);
//     }
// }



//(59)inter change the number
// public class Array {
// public static void swap(int [] a) {
//     int temp = a[0];
//     a[0] = a[1];
//     a[1] = temp;
// }
// public static void main(String[] args) {
//     int [] a = {10,20};
//     System.out.println(a[0] + " " + a[1]);
//     swap(a);
//     System.out.println(a[0] + " " + a[1]);
// }
// }



//(60)write a program to reverse the array without using any extra array
// public class Array {
// public static void print(int [] arr){
//     for(int i=0; i<arr.length; i++){
//         System.out.print(arr[i] + " ");
//     }
//     System.out.println();
// }
// public static void main(String[] args){
//     int [] arr = {2,3,5,7,9,11,13,17};
//     int n = arr.length;
//     print(arr);
//     int i=0, j=n-1;
//     while (i<j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//         i++;
//         j--;
//     }
//     print(arr);
// }
// }



//(61)2D Array
// import  java.util.*;
// public class Array {

//     public static void main(String[] args) {
//         Scanner sc = new  Scanner(System.in);
//         int rows = sc.nextInt();
//         int cols = sc.nextInt();
//         int[][] numbers = new int[rows][cols];
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols; j++){
//                 numbers[i][j] = sc.nextInt();
//             }
//         }
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols; j++){
//                 System.out.print(numbers[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// } 



//(62) square of even number
// public class Array {
// public static void main(String[] args) {
//     int count = 0;
//     for(int i=0; i<=20; i++){
//         if(i % 2 == 0){
//             System.out.print(i*i+ " ");
//             count++;
//             System.out.println("Even Number = " + count);
//         }
//         else if (i % 2 != 0);
//         {
            
//             System.out.print(i+i + " ");

//         }
//     }
    
// }
    
// }



