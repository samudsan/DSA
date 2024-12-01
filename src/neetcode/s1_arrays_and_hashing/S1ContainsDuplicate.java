package neetcode.s1_arrays_and_hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class S1ContainsDuplicate {
    public static void main(String[] args) {
        int array[] = new int[]{1,2,3,1};
        boolean results = containsDuplicate2(array);
        System.out.println(results);
    }
/*
* the approach is using HashSet,
* by default HashSet add method returns false if the element that we tried adding already exist.
*
* */
    private static boolean containsDuplicate(int array[]) {
        HashSet<Integer> seen =  new HashSet<>();
        for (int element :array) {
            if(!seen.add(element))
                return true;
        }
        return false;

    }

    /*
    * If HashSet is not allowed, we can simulate same behavior using ArrayList. Initially we add element to ArrayList,
    * before we insert elements to ArrayList we will check if element is already exist. if exist we return true.
    * */



    // Solution 2: Two Pointers with Sorting (Faster for Large Arrays with Duplicates)
    public static boolean containsDuplicate1(int[] nums) {
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i + 1]) {
                    return true;
                }
            }
            return false;
    }


    // Solution 3: Using a Frequency Counter (Efficient for Arrays with Limited Range)
    public static boolean containsDuplicate2(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            if (freq.containsKey(num)) {
                return true;
            }
            freq.put(num, 1);
        }
        return false;
    }
}
