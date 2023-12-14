package neetcode.other;

import java.util.HashMap;

public class S1_SubArraySumEqualsK {
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int target = 2;
        System.out.println(Solution.subarraySum(nums, target));
    }
}

class Solution {
    public static int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap < Integer, Integer > map = new HashMap< >();
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
