package neetcode.other.s1_arrays;

public class S1_RotateArrayBest {
    public static void main(String[] args) {
        int arr[] = rotateArray(new int[]{1,2,3,4,5,6,7,8}, 3);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    static int[] rotateArray(int[] nums, int k){
        int n = nums.length;
        // Step 1: Reverse the whole array
        reverse(nums, 0, n - 1);
        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Step 3: Reverse the remaining elements
        reverse(nums, k, n - 1);
        return nums;

    }

    public static int[] reverse(int[] arr, int start, int end){
        int temp;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}