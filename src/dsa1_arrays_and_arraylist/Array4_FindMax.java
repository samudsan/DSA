package dsa1_arrays_and_arraylist;

public class Array4_FindMax {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 54, 2, 3, 6};
        System.out.println(findMax(arr));
        System.out.println(findMaxInRange(arr, 5, 7));
    }

    public static int findMax(int[] arr){
        if(arr.length <=0)
            return -1;
        if(arr ==  null)
            return -1;
        else{
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if(max < arr[i]){
                    max = arr[i];
                }
            }
            return max;
        }
    }


    public static int findMaxInRange(int[] arr, int start, int end){
        if(arr.length <=0 )
            return -1;
        if(start < 0 || end >=arr.length)
            return -1;
        else{
            int max = arr[start];
            for (int i = start; i <= end; i++) {
                if(max < arr[i]){
                    max = arr[i];
                }
            }
            return max;
        }
    }
}
