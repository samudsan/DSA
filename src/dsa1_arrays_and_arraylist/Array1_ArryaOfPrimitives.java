package dsa1_arrays_and_arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class Array1_ArryaOfPrimitives {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int[] arr = new int[3];

        // inserting using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //Iterating through for each loop
        for (int element : arr) {
            System.out.println(element);
        }
        System.out.println(Arrays.toString(arr));
    }
}