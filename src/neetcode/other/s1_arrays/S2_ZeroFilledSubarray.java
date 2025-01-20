package neetcode.other.s1_arrays;

public class S2_ZeroFilledSubarray {
    public static void main(String[] args) {
        System.out.println(zeroFilledSubarrays(new int[]{0,0,0,2,0,0,2}));
    }

    static long zeroFilledSubarrays(int[] nums) {
        long result = 0;
        int zeroCount = 0;

        for (int num : nums) {
            // Check if the current number is zero
            if (num == 0) {
                // Extend the current zero sequence
                zeroCount++;
            } else {
                // Calculate subarrays for the zero sequence
                result += zeroCount * (zeroCount + 1L) / 2;
                // Reset zero sequence counter
                zeroCount = 0;
            }
        }

        // If the last element was part of a zero sequence, add its subarrays
        result += zeroCount * (zeroCount + 1L) / 2;

        return result;
    }
}
