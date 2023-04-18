package dsa1_arrays_and_arraylist;

import java.util.Arrays;

public class Array5_ReverseAnAray {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,5,23,6};
        System.out.println(Arrays.toString(arr));

        //Using for loop
        for (int i = 0; i < arr.length/2 ; i++) {
            swap(arr, i, arr.length-(i+1));
        }
        System.out.println(Arrays.toString(arr));

        //using while loop
        arr = new int[]{2,4,5,23,6};
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
         arr[index1] = arr[index2];
         arr[index2] = temp;
    }
}
