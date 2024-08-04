package neetcode.other;

import java.util.HashMap;

public class S1_SubArraySumEqualsK {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int target = 2;
        System.out.println(Solution.subarraySum(nums, target));
    }
}

class Solution {
    public static int subarraySum(int[] nums, int k) {
        int count = 0, currentSum = 0;
        HashMap<Integer, Integer> cummulativeSumCounts = new HashMap<>();
        // to handle cases where a subarray's sum equals k directly from the start of the array.
        cummulativeSumCounts.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (cummulativeSumCounts.containsKey(currentSum - k))
                count += cummulativeSumCounts.get(currentSum - k);
            cummulativeSumCounts.put(currentSum, cummulativeSumCounts.getOrDefault(currentSum, 0) + 1);
        }
        return count;
    }
    /*
    * To find the number of subarrays with a sum equal to 𝑘 maintain a running cumulative sum
    * and use a hash map to track how frequently each cumulative sum occurs.
    * For each element, check if the difference between the current cumulative sum and 𝑘 exists in the hash map,
    * and update the count of valid subarrays accordingly.*/
}
