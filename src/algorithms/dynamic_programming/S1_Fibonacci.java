package algorithms.dynamic_programming;

public class S1_Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(5));

    }

    public static int fib(int n){
        if(n == 0)
            return 1;
        if(n==1)
            return 1;
        else return fib(n-1) + fib(n-2);
    }
    /*Problems with this approach:
        Exponential time complexity O(2ⁿ)
        Redundant calculations
        Stack overflow for large n
        Each recursive call uses additional stack space
    */

}
