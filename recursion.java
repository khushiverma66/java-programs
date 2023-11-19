import java.util.*;
public class recursion {
    // PRINT NAMES N TIMES

    // public static void f(int i,int n){
    //         if(i>n){
    //             return;
    //         }
    //         System.out.println("raj");
    //         f(i+1,n);
    //     }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n=sc.nextInt();
    //     f(1,n);
    // }


    // PRINT LINEARLY 1-N

    // public static void f(int i,int n){
    //     if(i>n){
    //         return;
    //     }
    //     System.out.println(i);
    //     f(i+1,n);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     f(1,n);
    // }

//PRINT LINEARLY N-1

    // public static void f(int i,int n){
    //     if(i<1){
    //         return;
    //     }
    //     System.out.println(i);
    //     f(i-1,n);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     f(n,n);
    // }


    //PRINT 1-N USING BACKTRACKING

    // public static void f(int i,int n){
    //     if(i>n){
    //         return;
    //     }
    //     f(i+1,n);
    //     System.out.println(i);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     f(1,n);
    // }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // public static void printNumb(int n){
    //     if(n==0){
    //         return;
    //     }
    //     System.out.println(n);
    //     printNumb(n-1);
    // }
    // public static void main(String[] args) {
    //     int n = 5;
    //     printNumb(n);
    // }

    // public static void printNumb(int n){
    //     if(n==6){
    //         return;
    //     }
    //     System.out.println(n);
    //     printNumb(n+1);
    // }
    // public static void main(String[] args) {
    //     int n = 1;
    //     printNumb(n);
    // }

    // public static void sum(int i,int n,int sum){
    //     if(n==i){
    //         sum+=i;
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum+=i;
    //     sum(i+1,n,sum);

    // }
    // public static void main(String[] args) {
    //     sum(1,5,0);
    // }

    // public static int factorial(int n){
    //     if(n==1 || n==0){
    //         return 1;
    //     }
    //     int fact = factorial(n-1);
    //     int fact_n = n*fact;
    //     return fact_n;
    // }
    // public static void main(String[] args) {
    //     int n = 5;
    //     int ans = factorial(n);
    //     System.out.println(ans);
    // }
    

    // public static int power(int x,int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     if(x==0){
    //         return 0;
    //     }
    //     int xpowern = power(x,n-1);
    //     int xpow = x * xpowern;
    //     return xpow;
    // }
    // public static void main(String[] args) {
    //     int x=2;
    //     int n=5;
    //     int ans = power(x, n);
    //     System.out.println(ans);
    // }

    // public static void reverseString(String str){
    //     if(str.length()==0 || str.length()<=1){
    //         System.out.println(str);
    //     }
    //     else{
    //         System.out.print(str.charAt(str.length()-1));
    //         reverseString(str.substring(0,str.length()-1));
    //     }
    // }
    // public static void main(String[] args) {
    //     String str = "abcd";
    //     reverseString(str);
    public static void main(String[] args) {
        
    }
}

 

