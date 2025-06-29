package Recursion;
//factorial of any numbers !n>>> 6!>>> 6*5*4*3*2*1

public class printfactorial {

    public static int factorial(int n){
        if (n==1){
            return n;
        }else {
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        int factorial = factorial(3);
        System.out.println(factorial);
    }
}
