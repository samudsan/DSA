package dsa1_arrays_and_arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class Array3_MultiDimentionalArray {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int[][] arr = new int[2][3];

        //Inserting elements into arrya
        System.out.println("Enter 6 array elements");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //print 2d array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //printing using Arrays.toString()
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));

        }
    }
}
