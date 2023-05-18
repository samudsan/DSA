package neetcode.arrays_and_hashing;

public class S6_RomoveElementsInPlace {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println("\n count is "+removeElement(nums, val));
    }

    private static int removeElement(int[] nums, int val) {
        int temp, i=0;
        for (int j = 0; j <nums.length; j++) {
            if (nums[j] != val) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i;
    }
}
