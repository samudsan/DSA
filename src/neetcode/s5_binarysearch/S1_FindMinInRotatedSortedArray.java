package neetcode.s5_binarysearch;

public class S1_FindMinInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 1, 2};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] arr) {
        int l = 0, r = arr.length - 1;
        int mid, min;

        while (l <= r) {
            mid = (l + r) / 2;
            if (arr[mid] > arr[r]) { // this is true only if min lies right side of array/ right half is not fully sorted
                l = mid + 1;
            } else if (arr[mid] < arr[r]) {
                r = mid;
            } else
                return arr[mid];
        }
        return -1;
    }
}
