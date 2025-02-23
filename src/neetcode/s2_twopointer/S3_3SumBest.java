package neetcode.s2_twopointer;

import java.util.*;

public class S3_3SumBest {
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        get3Sum(nums);
    }
    // We need to sort the array then we will go through the elements, we assume that
    // each element is part of triplet and search for other two elements in the array
    // finding other two element is based on twosum algorithm when array is sorted.
    // while finding other two element we can ignore already visited/considered for triplets from the initial for loop

    public static void get3Sum(int arr[]) {

        // Sort the elements
        Arrays.sort(arr);
        Set<List<Integer>> result = new HashSet<>();

        // Now fix the first element and find the other two elements
        for (int i = 0; i < arr.length - 2; i++)
        {
            // Find other two elements using Two Sum approach
            // as our intention is finding unique triplets we can always start from i+1 (i.e. all triplets of i will be captured at the ith iteration)
            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {

                    // Add the set, and move to find other triplets
                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;
                } else if (sum < 0)
                    left++;
                else
                    right--;
            }
        }
        System.out.println( new ArrayList<>(result));
    }
}

