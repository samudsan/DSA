package javasnippets;

import java.util.ArrayList;
import java.util.List;

public class S9_GenerateSubArraysBrueForce {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        List<List<Integer>> subArrays = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> subArray = new ArrayList<>();
            for (int j = i; j < nums.length; j++) {
                subArray.add(nums[j]);
                subArrays.add(new ArrayList<>(subArray));
            }
        }
        System.out.println(subArrays);
    }
}
