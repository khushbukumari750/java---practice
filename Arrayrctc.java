//(1) write a program to declare initialize and display the elements of an integer array
// public class Arrayrctc {
//     public static void main(String[] args) {
//         int arr[] = {5,7,3,9,11,6};
//         int n = arr.length;
//         for(int i=0; i<n; i++){
//             System.out.println(arr[i]);
//         }
//     }
// }


//(2)write a program to take an array of integer and travers it from start to end .display all the element of the array
// import java.util.*;
// public class Arrayrctc {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size = ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.print("Enter element = ");
//         for(int i=0; i<arr.length; i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.print("Reverse array = ");
//         for(int i=arr.length-1; i>=0; i--){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }



//(3)write a program to take an array and print it from half to start
// import java.util.*;
// public class Arrayrctc {

//     public static void main(String[] args) {
//         Scanner sc  = new Scanner(System.in);
//         System.out.print("Enter size = ");
//         int n = sc.nextInt();
//         int []arr = new int[n];
//         System.out.print("Enter Element = ");
//         for(int i=0; i<arr.length; i++){
//              arr[i] = sc.nextInt();
//         }
//         System.out.print("Reverse Array = ");
//         for(int i=arr.length/2; i>=0; i--){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }


//(4) write a program to take an array and travers it from start to half
// import java.util.*;
// public class Arrayrctc {
//         public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size = ");
//         int n = sc.nextInt();
//         int []arr = new int[n];
//         System.out.print("Enter Element = ");
//         for(int i=1; i<arr.length; i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.print("Reverse first half array = ");
//         for(int i=1; i<=arr.length/2; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }


//(5) write a program to take an array and travers it from end to half
// import java.util.*;
// public class Arrayrctc {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size = ");
//         int n = sc.nextInt();
//         int []arr = new int[n];
//         System.out.print("Enter Element = ");
//         for(int i=0; i<arr.length; i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.print("Reverse end half array = ");
//         for(int i=arr.length-1; i>=arr.length/2; i--){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }





//(6)write a program to take an array and traverse it from half to end
// import java.util.*;
// public class Arrayrctc {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size = ");
//         int n = sc.nextInt();
//         int [] arr = new int[n];
//         System.out.print("Enter element = ");
//         for(int i=0; i<arr.length; i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.print("Reverse first half element = ");
//         for(int i=(arr.length)/2; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }



//(7)write a program to print minimum element of an array
// public class Arrayrctc {

//     public static void main(String[]args){
//         int arr[] = {5,3,7,8,9};
//         int n = arr.length;
//         int minValue = arr[0];
//         for(int i=0; i<n; i++){
//             if(arr[i]<minValue){
//                 minValue = arr[i];
//             }
//         }
//         System.out.println(minValue);
//     }
//  }



//(8)write a program to maximum element of an array
// public class Arrayrctc {
//     public static void main(String[] args) {
//         int arr[] = {4,5,9,7,22,77,88,2,44,55};
//         int n = arr.length;
//         int maxvalue =arr[0];
//         for(int i=0; i<n; i++){
//             if(arr[i]>maxvalue){
//                 maxvalue = arr[i];
//             }
//         }
//         System.out.println(maxvalue);
//     }
// }



//(9) write a program to print span of an array
// import java.util.*;
// public class Arrayrctc {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Enter size of array = ");
//         int n = sc.nextInt();
//         int[]arr = new int[n];
//         System.out.print("Enter array element = ");
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         int max = arr[0];
//         int min = arr[0];
//         for(int i=1; i<n; i++){
//             if(arr[i]>max){
//                 max = arr[i];
//             }
//             if(arr[i] < min){
//                 min = arr[i];
//             }
//         }
//         int span = max - min;
//         System.out.print("Span = " + span);

//     }
// }



//(10) write a program to print 2 arrays together using single for loop
// import java.util.*;
// public class Arrayrctc {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size = ");
//         int n = sc.nextInt();
//         int arr1 [] = new int[n];
//         int arr2 [] = new int[n];
//         System.out.println("Enter first array = ");
//         for(int i = 0; i<n; i++){
//             arr1[i] = sc.nextInt();
//         }
//         System.out.println("Enter second array = ");
//         for(int i=0; i<n; i++){
//             arr2[i] = sc.nextInt();
//         }
//         System.out.println("Both arrays together = ");
//         for(int i =0; i<n; i++){
//             System.out.println(arr1[i] + " " + arr2[i] + " ");
//         }
//     }
// }



//(11)write a program to print the sum of all element in a given array
// import java.util.*;
// public class Arrayrctc {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size = ");
//         int n = sc.nextInt();
//         int sum = 0;
//         int [] arr = new int[n];
//         System.out.print("Enter the element = ");
//         for(int i=0; i<arr.length; i++){
//             arr[i] = sc.nextInt();
//             sum = sum+arr[i];
//             System.out.print("sum = " + sum);
//         }
//     }
// }



//(12)write a program to create a new array containing only the even element of a given array . the program should
//(1)take an input array of integers
//(2)create a new array to store only the even elements from the input array
//(3)Return the new array and display its contents 

// import java.util.*;
// public class Arrayrctc {

//     public static int[] getEvenElement(int[]arr){
//         int count = 0; 
//         for(int i=0; i<arr.length; i++){
//             if(arr[i]%2==0){
//                 count++;
//             }
//         }
//         int[]even = new int[count];
//         int j= 0;
//         for(int i=0; i<arr.length; i++){
//             if(arr[i]%2 == 0){
//                 even[j] = arr[i];
//                 j++;
//             }
//         }
//         return even;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size = ");
//         int n= sc.nextInt();
//         int [] arr = new int[n];
//         System.out.print("Enter element = ");
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         int [] result = getEvenElement(arr);
//         System.out.println("Even element = ");
//         for(int i=0; i<result.length; i++){
//             System.out.print(result[i] + " ");
//         }
//     }
// }



//(13)write a program to create a new array containing only the odd element of a given array . the program should
//(1)take an input array of integers
//(2)create a new array to store only the odd elements from the input array
//(3)Return the new array and display its contents

// import java.util.*;
// public class Arrayrctc {
//     public static int[] getOddElement(int[]arr){
//         int count = 0; 
//         for(int i=0; i<arr.length; i++){
//             if(arr[i]%2 != 0){
//                 count++;
//             }
//         }
//         int[]odd = new int[count];
//         int j = 0;
//         for(int i=0; i<arr.length; i++){
//             if(arr[i] % 2 != 0){
//                 odd[j] = arr[i];
//                 j++;
//             }
//         }
//         return odd;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size = ");
//         int n = sc.nextInt();
//         int[]arr = new int[n];
//         System.out.print("Enter Element = ");
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         int[]result = getOddElement(arr);
//         System.out.print("Odd element = ");
//         for(int i =0; i<result.length; i++){
//             System.out.print(result[i] + " ");
//         }
//     }
// }




//(14) write a program to print sum of only even elements of an array
// public class Arrayrctc {

//     public static void main(String[] args) {
//         int []arr = {1,6,9,8,7,44,33,22};
//         int n = arr.length;
//         int sum = 0;
//         for(int i=0; i<n; i++){
//             if(arr[i]%2 == 0){
//                 sum = sum + arr[i];
//             }
//         }
//         System.out.println("Sum of even element = " + sum);
//     }
// }



//(15) write a program to print sum of only odd element of an array
// public class Arrayrctc {

//     public static void main(String[] args) {
//         int [] arr = {55,66,22,99,7,1,2,5,6,8};
//         int n = arr.length;
//         int sum = 0;
//         for(int i=0; i<n; i++){
//             if(arr[i] % 2 != 0){
//                 sum = sum+arr[i];
//             }
//         }
//         System.out.println("Sum of all odd element = " + sum );
//     }
// }



//(16)write a program to print product of only even elements of an array
// public class Arrayrctc {

//     public static void main(String[] args) {
//         int [] arr = {1,7,5,6,2,3,4};
//         int n = arr.length;
//         int mul = 1;
//         for(int i=0; i<arr.length; i++){
//             if(arr[i] % 2 == 0){
//                 mul = mul*arr[i];
//             }
//         }
//         System.out.println("multiple of even elments = "+ mul);
//     }
// }



//(17) write a program to print product of only odd elements of an array
// public class Arrayrctc {

//     public static void main(String[] args) {
//         int[]arr = {5,2,7,11,12,14};
//         int mul = 1;
//         for(int i=0; i<arr.length; i++){
//             if(arr[i]%2 != 0){
//                 mul = mul*arr[i];
//             }
//         }
//         System.out.println("multiple of odd element = " + mul);
//     }
// }



//(18) write a program to count the number of even and odd elements in an array
// import java.util.*;
// public class Arrayrctc {
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter size of element = ");
//     int n = sc.nextInt();
//     int[]arr = new int[n];
//     System.out.print("Enter array element = " );
//     for(int i = 0; i<arr.length; i++){
//         arr[i] = sc.nextInt();
//     }
//     int even = 0;
//     int odd = 0;
//     for(int i=0; i<arr.length; i++){
//         if(arr[i] % 2 == 0){
//             even++;
//         }
//         else{
//             odd++;
//         }
//     }
//     System.out.println("Enter even elements = " + even);
//     System.out.println("Enter odd element = " + odd);
// }
// }



//(19) write a program to find the square and cube of all elements of an array and store the results in to 
//separate arrays . Return the new arrays

// import java.util.*;
// public class Arrayrctc {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array = ");
//         int n = sc.nextInt();
//         int [] arr = new int[n];
//         int [] square = new int[n];
//         int [] cube = new int[n];
//         System.out.print("Enter array element = ");
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//             square[i] = arr[i] * arr[i];
//             cube[i] = arr[i]*arr[i]*arr[i];
//         }
//         System.out.print("Square array = ");
//         for(int i=0; i<n; i++){
//         System.out.print(square[i] + " ");
//         }
//         System.out.println();
//         System.out.print("Cube array = ");
//         for(int i=0; i<n; i++){
//          System.out.print(cube[i] +" ");
//         }
//     }
// }



//(20) Write a program to find the square Root and cube root of all elements of an array 
// //and store the results in two separate array Return the new arrays.
// public class Arrayrctc {
// public static void main(String[] args) {
//     int[]arr1 = {1,4,9,16,25};
//     int[]sqrt = new int[arr1.length];
//     for(int i=0; i<arr1.length; i++){
//         sqrt[i] = (int)Math.sqrt(arr1[i]);
//     }
//     System.out.print("sqrt = ");
//     for(int i=0; i<sqrt.length; i++){
//         System.out.print(sqrt[i] + " ");
//     }
//     int[]arr2 = {1,8,27,64,125};
//     int[]cbrt = new int[arr2.length];
//     for(int i=0; i<arr2.length; i++){
//         cbrt[i] = (int)Math.cbrt(arr2[i]);
//     }
//     System.out.print("\n cbrt = ");
//     for(int i=0; i<cbrt.length; i++){
//         System.out.print(cbrt[i] + "  ");
//     }
// }
// }


//input lena ho user se to
// import java.util.*;
// public class Arrayrctc {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of arr1 = ");
//         int n = sc.nextInt();
//         int [] arr1 = new int[n];
//         int [] sqrt = new int[n];
//         System.out.print("Enter arr1 elements = ");
//         for(int i=0; i<n; i++){
//             arr1[i] = sc.nextInt();
//             sqrt[i] = (int)Math.sqrt(arr1[i]);
//         }
//         System.out.print("sqrt = ");
//         for(int i=0; i<n; i++){
//             System.out.print(sqrt[i] + " ");
//         }

//         System.out.print("\n Enter size of array2 = ");
//         int m = sc.nextInt();
//         int [] arr2 = new int[m];
//         int [] cbrt = new int[m];
//         System.out.print("Enter arr2 elements = ");

//         for(int i=0; i<m; i++){
//             arr2[i] = sc.nextInt();
//             cbrt[i] = (int)Math.cbrt(arr2[i]);
//         }
//         System.out.print("cbrt = ");
//         for(int i=0; i<m; i++){
//             System.out.print(cbrt[i] + " ");
//         }
//     }
// }



//(21)write a program to store only two digit element of an array in new array . return the new array.
// import java.util.*;
// public class Arrayrctc {
// public static void main(String[] args) {
//     int[]arr = {5,12,7,22,33,57,34235,5654,342,5436,575,436,64};
//     int count = 0; 
//     for(int i=0; i<arr.length; i++){
//         if(arr[i]>=10 && arr[i]<=99){
//             count++;
//         }
//     }
//     int[]newArr =  new int[count];
//     int j = 0;
//     for(int i=0; i<arr.length; i++){
//         if(arr[i]>=10 && arr[i]<=99){
//             newArr[j] = arr[i];
//             j++;
//         }
//     }
//     System.out.println(Arrays.toString(newArr));
// }
// }



//(22) write a program to print the number of digits present in every integer element of an array
// public class Arrayrctc {
// public static void main(String[] args) {
//     int[]arr = {44,77,453,5,3444,5435,352};
//     for(int i=0; i<arr.length; i++){
//         int n = arr[i];
//         int count = 0;
//         while (n>0){
//             n = n/10;
//             count++;
//         } 
//         System.out.println(arr[i]+ " --->> " + count + "digits");
//     }
// }
// }



//(23) write a program to find and store the prime elements of an array in a new array .the program should 
// return the new array containing only the prime numbers

// public class Arrayrctc {
//         public static void main(String[] args) {
//         int arr [] = {2,3,4,666,77,5,83,87,57,97,333,22,93};
//         int newArr [] = new int[arr.length];
//         int k  = 0;
//         for(int i=0; i<arr.length; i++){
//             int count = 0;
//             for(int j=1; j<=arr[i]; j++){
//                 if(arr[i]%j == 0){
//                     count++;
//                 }
//             }
//             if(count == 2){
//                 newArr[k] = arr[i];
//                 k++;
//             }
//         }
//         for(int i=0; i<k; i++){
//             System.out.println(newArr[i] + " ");
//         }
//     }
// }



//(24) Write a program to print the number of occurence of a given element in an array 
// import java.util.*;
// public class Arrayrctc {
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size = ");
//     int n = sc.nextInt();
//     int[]arr = new int[n];
//     System.out.println("Enter array element = ");
//     for(int i=0; i<n; i++){
//         arr[i] = sc.nextInt();
//     }
//     System.out.println("Enter element to find = ");
//     int x = sc.nextInt();
//     int count = 0;
//     for(int i=0; i<arr.length; i++){
//         if(arr[i] == x){
//             count++;
//         }
//     }
//     System.out.println(x + "occurs " + count + "times ");
// }
// }




//(25)write a program to find whether the given element is present in an array or not 
// import java.util.*;
// public class Arrayrctc {
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the size = ");
//     int n = sc.nextInt();
//     int []arr = new int[n];
//     System.out.println("Enter array element = ");
//     for(int i=0; i<n; i++){
//         arr[i] = sc.nextInt();
//     }
//     System.out.println("Enter element to search = ");
//     int search = sc.nextInt();
//     boolean present = false;
//     for(int i=0; i<n; i++){
//         if(arr[i] == search){
//             present = true;
//             break;
//         }
//     }
//     if(present){
//         System.out.println("Enter is present in the array = ");
//     }
//     else{
//         System.out.println("Enter is not  present in the array = ");
//     }
// }
// }

