package neetcode.s5_binarysearch;

public class S1_FindMinInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 1, 2};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] nums) {
        // Initialize the left and right pointers
        int left = 0, right = nums.length - 1;

        // While there's a range to search
        while (left < right) {
            // Calculate the midpoint
            int mid = left + (right - left) / 2;

            // If middle element is greater than the right, min is in the right half
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                // min must be in the left half (including mid)
                right = mid;
            }
        }

        // The minimum element is at the pointer `left`
        return nums[left];
    }

}
