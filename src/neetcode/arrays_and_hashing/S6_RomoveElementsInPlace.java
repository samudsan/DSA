package neetcode.arrays_and_hashing;

public class S6_RomoveElementsInPlace {
    public static void main(String[] args) {
        int nums[] = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println("\n count is "+removeElement(nums, val));
    }

    private static int removeElement(int[] nums, int val) {
        if(nums.length == 0)
            return 0;
        int i = 0;
        int j = nums. length-1;
        int temp;
        while (i<j){
            if(nums[i] == val){
                while(i<j && nums[j] == val)
                    j--;
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
            else i++;
        }
        for (int ele: nums) {
            System.out.print(" "+ele);
        }
        return i+1;
    }


}
