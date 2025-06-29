package Recursion;
//Fibonacci series
public class Fibonacci {
    static int fabonacci(int n){
        if (n==0)
        return 0;

        if (n == 1)
            return 1;

        return fabonacci(n-1) + fabonacci(n-2);

    }

    public static void printFabnocci(int item){
        if (item==1){
            System.out.print(fabonacci(0) +("\t"));
        }else {
            printFabnocci(item-1);
            int fabnocciAtIndex = fabonacci(item);
            System.out.print(fabnocciAtIndex  + "\t");
        }
    }

    public static void main(String[] args) {

//        System.out.println(fabonacci(9));
//        for (int i=0; i<=10; i++){
//            System.out.println(fabonacci(i) +"\t");
//        }
//        System.out.println();
        printFabnocci(10);
    }

}
