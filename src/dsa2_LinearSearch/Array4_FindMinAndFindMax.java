package dsa2_LinearSearch;

public class Array4_FindMinAndFindMax {
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,2,54,54,64,4,5656,768,};
        int minAnswer = findMin(arr);
        int maxAnswer = findMax(arr);
        System.out.println("min is "+ minAnswer);
        System.out.println("max is "+ maxAnswer);
    }

    static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int minValue: arr) {
            if(minValue < min )
                min = minValue;
        }
        return min;
    }

    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int maxValue: arr) {
            if(maxValue > max)
                max = maxValue;
        }
        return max;
    }
}
