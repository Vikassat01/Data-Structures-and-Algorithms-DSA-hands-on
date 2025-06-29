package Recursion;
//Q1:-print 10 to 1
//Q2:-print 1 to 10

public class PrintNumber {

    //recursion print 10 to 1
    public static void printNumber(int n){  //n=10 >10==1=10 / 10>>10-1>>9-1>>8-1>>>>>>>>2-1=1>>10
        //base condition
        if (n==1){
            //true
            System.out.println(n);
        }else {
            System.out.println(n +"\t"); //10-1>9-1>8-1>>>>
            printNumber(n-1);

        }
    }
    public static void printNumber2(int n){
        //base condition
        if (n==1){
            System.out.println(n);
        }else {
            printNumber2(n-1);
            System.out.println(n); //
        }
    }



    public static void main(String[] args) {
        //print 10 to 1
        int n=10;
        printNumber(n);
        System.out.println("**************************");
        printNumber2(n);


    }

}
