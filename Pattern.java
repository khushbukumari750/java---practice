//(12)
// import java.util.*;
// public class Pattern {
//     public static void main(String[]args){
//         int n = 4;
//         int m = 5;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=m; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }


//(13)
// public class Pattern {

//     public static void main(String[]args){
//         int n = 5;
//         int m = 6;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=m; j++){
//                 if(i==1||i==n||j==1||j==m){
//                     System.out.print("*");
//                 }
//                 else{
//                         System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


//(14)
// import java.util.*;
// public class Pattern {

//     public static void main(String[]args){
//         int n = 4;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");
//             }
//                  System.out.println();
//         }
        
//     }
// }


//(15)
// public class Pattern {

//     public static void main(String[]args){
//         int n = 4;
//         for(int i = n; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


//(16)
// public class Pattern {

//     public static void main(String[]args){
//         int n = 4;
//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


//(17)
// public class Pattern {

//     public static void main(String[]args){
//         int n = 6;
//         for(int i=1; i <= n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }


//(18)
// public class Pattern {

//     public static void main(String[]args){
//         int n= 8;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i+1; j++){
//                 System.out.print(j+" "  );
//             }
//             System.out.println();
//         }
//     }
// }



//(19)
// public class Pattern {
//     public static void main(String[]args){
//         int n= 5;
//         for(int i=1; i<=n; i++){
//             for(int j = 1; j<=i; j++){
//                 int sum = i+j;
//             if (sum%2==0) {
//                 System.out.print("1");
//             }
//             else{
//                 System.out.print("0");
//             }
           
//         }
//          System.out.println();
//         }
//     }
// }


//(20)
// public class Pattern {
// public static void main(String[]args){
//     int n = 6;
//     int number = 1;
//     for(int i=1; i<=n; i++){
//         for(int j=1; j<=i; j++){
//             System.out.print(number + " ");
//             number++;
//         }
//             System.out.println();
//     }
// }
// }



//(21)
// public class Pattern {

//     public static void main(String[]args){
//         int n = 5;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             int spaces = 2*(n-i);
//             for(int j = 1; j<=spaces; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=n; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             int spaces = 2*(n-i);
//             for(int j=1; j<=spaces; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


//(22)
// public class Pattern {

//     public static void main(String[]args){
//         int n = 5;
//         for(int i =1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=5; j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//     }
// }



//(23)
// public class Pattern {

//     public static void main(String[]args){
//         int n = 6;
//         for(int i=1; i<=n; i++){
//             for(int j =1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print(i+ " ");
//             }
//             System.out.println();
//         }
//     }
// }


//(24)
// public class Pattern {

//     public static void main(String[]args){
//         int n = 6;
//         for(int i=1; i<=n; i++){
//         for(int j=1; j<n-i; j++){
//             System.out.print(" ");
//         }
//         for(int j=i; j>=1; j--){
//             System.out.print(j);
//         }    
//         for(int j = 2; j<=i; j++){
//             System.out.print(j);
//         }
//         System.out.println();
//         }
//     }
// }


//(25)
// public class Pattern {

//     public static void main(String[]args){
//         int n = 5;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=2*i-1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=n; i>=1; i--){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=2*i-1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


//(26)
// public class Pattern {

//     public static void main(String[]args){
//         int n = 4;
//         for(int i = 1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//         for(int i=1; i<=n; i++){
//             for(int j=n; j>=i; j--){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//     }
// }


//(27)
// public class Pattern {

//     public static void main(String[]args){
//         int n = 5;
//         for(int i=n; i>=1; i--){
//             for(int j=n; j>=i; j--){
//                 System.out.print(" ");
//             }
//             for(int k=1; k<=i; k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


//(28)
// public class Pattern {
//     public static void main(String[]args){
//         int n=5;
//         for(int i=1; i<=n; i++){
//             for(int j=n; j>=i; j--){
//                 System.out.print(" ");
//             }
//             for(int k=1; k<=i; k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



//(29)
// public class Pattern {

//     public static void main(String[]args){
//         int n = 5;
//         for(int i=1; i<=n; i++){
//             for(int j=n; j>=i; j--){
//                 System.out.print(" ");
//             }
//             for(int k=1; k<=i; k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=n-1; i>=1; i--){
//             for(int j =n; j>=i; j--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


//(30)
public class Pattern {
public static void main(String[] args) {
    int n = 4;
    int m = 6;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=m; j++){
            if(i==1||i==n||j==1||j==m){
                System.out.print("4");
            }
            else if (j == 2 || j == 5){
                System.out.print("3");
            }
            
            else
            {
                System.out.print("2");
            }
        }
        System.out.println();
    }
}
}