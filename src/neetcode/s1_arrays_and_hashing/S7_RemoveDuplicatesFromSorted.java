package neetcode.s1_arrays_and_hashing;

public class S7_RemoveDuplicatesFromSorted {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,2,3,4,4,4};
        System.out.println("\n count is "+removeElement(nums));
        for (int num: nums
        ) {
            System.out.println(num);
        }
    }

    public static int removeElement(int[] nums){
        int i = 0; // maintaining temp index to store values with in the same array
        if(nums.length == 0 | nums.length ==1) // edge case
            return nums.length;
        for (int j = 0; j < nums.length-1; j++) {
            if(nums[j] != nums[j+1]){
                nums[i++] =nums[j]; // copying first element of each not duplicate comparison
            }
        }
        nums[i++] = nums[nums.length-1]; // Store the last element as whether it is unique or repeated, it hasn't stored previously

        return i;
    }
}
