package neetcode.s2_twopointer;

public class S2_TwoSum_II_ArrayIsSorted {
    public static void main(String[] args) {
        int nums[]  = {1,2,3,4,7,8,10,23};
        int target = 15;
        getTwoSumII(nums, target);
    }

    public static void getTwoSumII(int nums[], int target){
        int i = 0, j=nums.length-1;
        while(i<j){
            if(nums[i] + nums[j] < target)
                i++;
            else if(nums[i] + nums[j] > target)
                j--;
            else {
                System.out.println("i : " + i + "\n" + "j :" + j);
                break;
            }
        }
    }
}
