package algorithms.dynamic_programming;

import java.util.Arrays;

public class S3_HouseRobber_Recursive {
    static int[] memo;

    public static void main(String[] args) {
        int nums[] =  new int[]{2, 50, 3, 2, 100};
        System.out.println(rob(nums));
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
