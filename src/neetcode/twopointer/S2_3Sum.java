package neetcode.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S2_3Sum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int target = 0;
        List<List<Integer>> list = new ArrayList<>();
        int j,k,neededSum;
        for(int i=0; i< nums.length; i++){
            if(i == 0 || nums[i] != nums[i-1]){
                j = i+1; k=nums.length-1;
                neededSum = target - nums[i];
                while(j<k){
                    if(nums[j] + nums[k] == neededSum){
                        list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        while(j<k && nums[j]==nums[j+1]) j++;
                        while(j<k && nums[k]==nums[k-1]) k--;
                        j++;
                        k--;
                    }
                    else if(nums[j] + nums[k] < neededSum)
                        j++;
                    else k--;
                }
            }
        }
        return list;
    }

    public static class S5_TrappingRainWater {
    }
}
