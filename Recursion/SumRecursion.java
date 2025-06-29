package Recursion;

public class SumRecursion {

    //n=10 sum of 10 numbers with recursion
    static int sumNum(int n){
        if (n==1){
            return 1;
        }else {
            return n +sumNum(n-1);
        }
    }

    public static void main(String[] args) {
        int result= sumNum(10);
        System.out.println(result);
    }
}
