package neetcode.s2_twopointer;

public class S4_ContainerWithMostWater {
    public static void main(String[] args) {
        int nums[] = {1,8,6,2,5,4,8,3,2};
        System.out.println(getContainerWithMostWater(nums));
    }

    // It utilizes a two-pointer approach to iterate through the array from both ends, calculating the area between the pointers and updating the maximum area accordingly. Finally, it returns the maximum area.
    public static int getContainerWithMostWater(int nums[]){
        int left  = 0;
        int right = nums.length-1;
        int maxArea = 0, currentArea = 0;
        while(left < right){
            int containerLength = right - left;
            currentArea = containerLength * Math.min(nums[left], nums[right]);
            maxArea = Math.max(maxArea, currentArea);

            if(nums[left] < nums[right])
                left++;
            else
                right--;
        }
        return maxArea;
    }
}
