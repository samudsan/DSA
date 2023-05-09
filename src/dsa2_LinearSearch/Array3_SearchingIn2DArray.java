package dsa2_LinearSearch;

import java.util.Arrays;

public class Array3_SearchingIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,3,1},
                       {1,3,5,3}};
//        System.out.println(arr.length);
        int[] answer = searchIn2DArray (arr, 5);
        System.out.println("Element available in Array with index: "+ Arrays.toString(answer));

    }
    static int[] searchIn2DArray(int[][] arr, int target){
        for(int row=0; row<arr.length; row++){
            for (int column = 0; column < arr[row].length; column++) {
                if(target == arr[row][column])
                    return new int[]{row, column};
            }
        }
        return new int[]{-1, -1};
    }

}
