
import java.util.*;

public class recursion1 {
    // print n using recursion:
    // public static void recursiveFunction(int n) {
    // if(n>5){
    // return;
    // }
    // System.out.println(n);
    // n++;//n+1
    // recursiveFunction(n);
    // }
    // public static void main(String[] args) {
    // int n=1;
    // recursiveFunction(n);

    // }



//         // Calculate sum on 'n' numbers using recursive function
//     public static void recursionSum(int i, int n, int sum) {
//         if (i == n) {
//             sum+=i;
//             System.out.println(sum);
//             return;
//         }
//         sum+=i;
//         recursionSum(i+1, n, sum);
//         System.out.println(i);

//     }

//     public static void main(String[] args) {
//         recursionSum(1, 5, 0);
//     }

//     public static int recursiveFactorial(int n ){
//         if(n==1||n==0){
//             return 1;
//         }
//         int fact_nm1= recursiveFactorial(n-1);
//         int calcfactorial= n*fact_nm1;
//         return calcfactorial;
//     }
// public static void main(String[] args) {
//    int ans= recursiveFactorial(4);
//     System.out.println(ans);
// }

    // public static void recursionFibnacci(int a, int b, int n){
    //     if(n==0){
    //         return;
    //     }
        
    //     int c=a+b;
    //     System.out.println(c);
    //     recursionFibnacci(b, c, n-1);
    // }
    // public static void main(String[] args) {
    //     int a=0;
    //     int b=1;
    //     int n=10;
    //     System.out.println(a);
    //     System.out.println(b);

    //     recursionFibnacci(a, b, n-2);
    // }

        //         // Calculating Power of a number using recursive function.
        // public static int calculatePow(int x, int n){
            
        //     if(n==0){
        //         return 1;
        //     }

        //     if(x==0){
        //         return 0;
        //     }

        //   int calculatePow_nm1=calculatePow(x, n-1);           //Recursion         //function//
        //   int calculatePow_result= x * calculatePow_nm1;    
        //   return calculatePow_result;                       

        // }

        // public static void main(String[] args) {
                
        //         int ans = calculatePow(10, 2);
        //         System.out.println(ans);
        //         System.out.println(ans);


        // }   

           //         // Calculating Power of a number using recursive function (Stack height logn).
        public static int calculatePow(int x, int n){
            
            if(n==0){
                return 1;
            }

            if(x==0){
                return 0;
            }
                    if( n % 2 == 0 ){  
                 return calculatePow(x, n/2) * calculatePow(x, n/2);       
            } else {
                return calculatePow(x, n/2) * calculatePow(x, n/2) * x;
            }
         

        }

        public static void main(String[] args) {
                
                int ans = calculatePow(2, 6);
                System.out.println(ans);
                


        }   

         


}