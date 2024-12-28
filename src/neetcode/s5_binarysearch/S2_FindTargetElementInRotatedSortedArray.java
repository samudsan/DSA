package neetcode.s5_binarysearch;

public class S2_FindTargetElementInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,1,2};
        System.out.println(findMin(arr, 2));
    }

    public static int findMin(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid element is the target
            if (nums[mid] == target) {
                return mid;
            }

            // Determine which side is sorted
            if (nums[left] <= nums[mid]) { // Left part is sorted
                if (nums[left] <= target && target < nums[mid]) {
                    // Target is within the sorted left part
                    right = mid - 1;
                } else {
                    // Target is in the right part
                    left = mid + 1;
                }
            } else { // Right part is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    // Target is within the sorted right part
                    left = mid + 1;
                } else {
                    // Target is in the left part
                    right = mid - 1;
                }
            }
        }

        // If we reach here, target is not in array
        return -1;
}
