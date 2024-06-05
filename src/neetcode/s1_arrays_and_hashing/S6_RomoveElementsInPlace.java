package neetcode.s1_arrays_and_hashing;

public class S6_RomoveElementsInPlace {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println("\n count is "+removeElement(nums, val));

        for (int num: nums
             ) {
            System.out.println(num);
        }
    }

//    below method iterating through the array with two pointers, i and j,
//    where i keeps track of the current position to place non-val elements.
//    When an element at index j is not equal to val, it swaps the elements at indices i and j,
//    then increments i. Finally, it returns the new length of the modified array,
//    which effectively represents the number of elements remaining after removal.

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
