package neetcode.s5_binarysearch;

public class S2_FindTargetElementInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,1,2};
        System.out.println(findMin(arr, 2));
    }

    public static int findMin(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        int mid, TargetFoundAt;

        while (l <= r) {
            mid = (l + r) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            // laft portion of array which is sorted
            else if (arr[l] <= arr[mid]) {
                if (target < arr[l] || target > arr[mid]) //makes sure element is not in left sorted
                    l = mid + 1;
                else
                    r = mid - 1;
            }
            //right portion of array
            else {
                if (target < arr[mid] || target > arr[r]) // makes sure element is not right sorted
                    r = mid - 1;
                else
                    l = mid + 1;
            }
        }
        return -1;
    }
}
