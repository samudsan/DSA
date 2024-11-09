package algorithms.dynamic_programming;

import java.util.Arrays;

public class S4_HouseRobber_II_Recursive {
    static int[] memo;

    public static void main(String[] args) {
        int nums[] =  new int[]{50, 2, 3, 2, 100};

        // we are splitting problem into array 0 to n-1 and then 1-n, passing these arrays to house robber problem and getting max out of them .
        // solving this way as first and last housed are adjecent in a cycle
        System.out.println(Math.max(rob(Arrays.copyOfRange(nums, 0, nums.length-1)),rob(Arrays.copyOfRange(nums, 1, nums.length) )));
    }

    public static int rob(int[] nums) {
        memo = new int[nums.length+1];
        Arrays.fill(memo, -1);
        return rob(nums, nums.length-1);
    }
    public static int rob(int[] nums, int i){
        if(i<0)
            return 0;
        if(memo[i] >= 0)
            return memo[0];

        int result = Math.max(rob(nums, i-2)+nums[i], rob(nums, i-1));
        memo[i] = result;
        return result;
    }
}
