//(31)

// import java.util.*;
// public class Function {

//     public static void printMyName(String village){
//         System.out.println(village);
//         return;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();
//         printMyName(name);
//     }
// }


//(32)
// import java.util.*;
// public class Function {

//     public static int calculateSum(int a,int b){
//         int sum = a+b;
//         return sum;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = calculateSum(a, b);
//         System.out.println("sum of 2 numbers is"+sum);
//     }
// }


//(33)
// import java.util.*;
// public class Function {

//     public static int calculateSub(int a, int b){
//         int sub = a-b;
//         return sub;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sub = calculateSub(a, b);
//         System.out.println("sub of 2 numbers is = "+sub);
//     }
// }


//(34)
// import java.util.*;
// public class Function {

//     public static int calculateMul(int a, int b){
//         int mul = a*b;
//         return mul;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new  Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int mul = calculateMul(a, b);
//         System.out.println("Multiply of 2 numbers is = " + mul);
//     }
// }


//(35)
// import java.util.*;
// public class Function {

//     public static int calculateDev(int a, int b){
//         int div = a/b;
//         return div;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int div = calculateDev(a, b);
//         System.out.println("Devide of 2 numbers = " + div);
//     }
// }


//(36)
// import java.util.*;
// public class Function {

//     public static void printFactorial(int n){
//         int factorial = 1;
//         for(int i =n; i>=1; i--){
//             factorial = factorial*i;
//         }
//         System.out.println(factorial);
//         return ;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         printFactorial(n);
//     }
// }


//(37) print even number and odd number
// import java.util.*;
// public class Function {

//     public static void calculateEvenNo(int n){
//         for(int i = 1; i<=n; i++){
//             if (i%2==0) {
//                 System.out.println(i +"even number1");
//             }
//             else{
//                 System.out.println(i+"odd Number");
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         calculateEvenNo(n);
//     }
// }


//(38)prient even number
// import java.util.*;
// public class Function {

//     public static void printEvenNo(int n){
//         for(int i=1; i<=n; i++){
//             if(i%2==0){
//                 System.out.println(i);
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//             int n = sc.nextInt();
//             printEvenNo(n);
        
//     }
// }


//(39) print prime numberr and not prime number
// import java.util.*;
// public class Function {

//     public static void checkPrime(int n){
//         int count = 0;
//         for(int i=1; i<=n; i++){
//             if(n%i == 0){
//                 count++;
//             }
//         }
//         if(count == 2){
//             System.out.println("Prime Number");
//         }
//         else{
//             System.out.println("Not Prime Number");
//         }
//     }
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         checkPrime(n);
//     }
// }


//(40)pri prime number and not prime number (ek sath)
// import java.util.*;
// public class Function {

//     public static void checkPrime(int n){
//         int count = 0;
//         for(int i=1; i<=n; i++){
//             if(n % i == 0){
//                 count++;
//             }
//         }
//         if (count == 2) {
//             System.out.println(n + " = prime number");
//         }
//         else{
//             System.out.println(n + " = Not Prime Number");
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//             System.out.print("Enter N = ");
//         int n = sc.nextInt();
//         for(int i = 1; i <= n; i++){
//             checkPrime(i);
//         }
//     }
// }


import java.util.*;
public class Function {

    public static void checkPrime(int n){
        int count = 0;
        for(int i = 1; i<=n; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println(n +" prime number");
        }
        else{
            System.out.println(n + "Not Prime Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0; i<=n; i++){
            checkPrime(i);
        }
    }
}