package dsa2_LinearSearch;

public class Array5_FindNumberWithEvenNumberOfdigits {
    public static void main(String[] args) {
        int[] arr = new int[]{ 1,234,36,3453,23,2,564,44565};
        System.out.println("Count of Number with odd number of digits : "+ findNumbers(arr) );

    }
    static int findNumbers(int[] arr){
        int finalCount=0;
        for (int number: arr) {
            if(findDigits(number) % 2 == 1)
                finalCount++;
        }
        return finalCount;
    }

    static int findDigits(int number){
        int count = 0;
        while(number > 0){
            number = number /10;
            count ++;
        }
        return count;
    }
}

