package dsa1_arrays_and_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2_2dArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> al2d = new ArrayList<>();

        // Initializing 2d arrya elements
        for (int i = 0; i < 2; i++) {
            al2d.add(new ArrayList<>());
        }
        // add element into 2d arraylist
        System.out.println("Please enter 2d arraylist elements");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                al2d.get(i).add(sc.nextInt());
            }
        }

        System.out.println(al2d);
    }
}
