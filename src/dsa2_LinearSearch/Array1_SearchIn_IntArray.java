package dsa2_LinearSearch;

public class Array1_SearchIn_IntArray {
    public static void main(String[] args) {
        int[] arr =  new int[]{1,2,4,5,23,2,5};
        int searchElement  = 5;
        System.out.println("Found Element: "+isElementFound(arr, searchElement));
        System.out.println("Found Element at index: "+getElementIndex(arr, searchElement));
        System.out.println("Found Element found in range: "+isElementFoundInRange(arr, 1,4,searchElement));

    }

    static boolean isElementFound(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(target == arr[i])
                return true;
        }
        return false;
    }

    static int getElementIndex(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(target == arr[i])
                return i;
        }
        return -1;
    }

    static boolean isElementFoundInRange(int[] arr, int startIndex, int endIndex, int target){
        while(startIndex < endIndex){
            if(arr[startIndex] == target)
                return true;
            startIndex++;
        }
        return false;
    }
}
