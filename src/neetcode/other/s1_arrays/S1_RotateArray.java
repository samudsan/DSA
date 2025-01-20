package neetcode.other.s1_arrays;

public class S1_RotateArray {
    public static void main(String[] args) {
        int arr[] = rotateArray(new int[]{1,2,3,4,5,6,7,8}, 3);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    static int[] rotateArray(int[] arr, int k){
        int n = arr.length;
        int dummyArray[] = new int[n];

        // copy elements to its respective positions
        for (int i = 0; i < n; i++) {
            dummyArray[(i+k)%n] = arr[i];
        }
        return dummyArray;
    }
}
