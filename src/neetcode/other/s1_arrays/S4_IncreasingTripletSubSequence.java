package neetcode.other.s1_arrays;

public class S4_IncreasingTripletSubSequence {
    public static void main(String[] args) {
        System.out.println(tripletSubsequence(new int[]{1, 2, 0}));
    }
    public static boolean tripletSubsequence(int nums[]){
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int num: nums){
            if(num<= first)
                first = num;
            else if(num <= second)
                second = num;
            else
                return true;
        }
        return false;
    }
}
