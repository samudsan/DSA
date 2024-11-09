package algorithms.dynamic_programming;

import java.util.HashMap;
import java.util.Map;

/*
* why we need Dynamic Programming:
    Memoization prevents recalculation
    Reduces time complexity to O(n)
    Makes the algorithm practical for larger numbers
* */
public class S2_FibonacciDynamicWay {
    static Map<Integer, Long> memoryMap = new HashMap<>();
    public static void main(String[] args) {

        System.out.println(fibUsingDpIterative(50));
        System.out.println(fib(50));

    }
/*
* How it works (Bottom up): without recursion
1. Create array to store all values up to n
2. Start from base cases (0 and 1)
3. Build up to desired number
* */
    public static long fibUsingDpIterative(int n){
        long[] memory = new long[n+1];
        memory[0] = 0;
        memory[1] = 1;

        for (int i = 2; i <=n; i++) {
            memory[i] = memory[i-1] + memory[i-2];
        }
        return memory[n];
    }

/*
* How it works:
1. Create a HashMap to store calculated values
2. Before calculation, check if value exists in memory
3. After calculation, store result in memory
* */
    public static long fib(int n){


        if(n<= 1)
            return n;

        if(memoryMap.containsKey(n)) {
            return memoryMap.get(n);
        } else{
            long results = fib(n-1) + fib(n-2);
            memoryMap.put(n, results);
        }
        return memoryMap.get(n);
    }
}




