package algorithms.dynamic_programming;

public class S3_HouseRobber_Iterative {
    public static void main(String[] args) {
        int nums[] =  new int[]{2, 50, 3, 2, 100};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        int memo[] = new int[nums.length+1];
        memo[0] = 0;
        memo[1] = nums[0];

        for(int i=1; i<nums.length; i++){
            memo[i+1] = Math.max(memo[i], memo[i-1]+nums[i]);
        }
        return memo[nums.length];

    }
}
