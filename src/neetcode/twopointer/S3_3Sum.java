package neetcode.twopointer;

import java.util.ArrayList;
import java.util.List;

public class S3_3Sum {
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        get3Sum(nums);
    }

    public static void get3Sum(int nums[]){
        List<List<Integer>> list = new ArrayList<>();
        int twoSumTarget;
        for (int i = 0; i <  nums.length; i++) {
            twoSumTarget = -1*nums[i];
            int start=0, end=nums.length-1;
            while(start < end){

                if(nums[start] + nums[end] < target)
                    start++;
                else if(nums[start] + nums[end] > target)
                    end--;
                else {
                    System.out.println("start : " + start + "\n" + "end :" + end);
                    break;
                }
            }
        }
    }
}
