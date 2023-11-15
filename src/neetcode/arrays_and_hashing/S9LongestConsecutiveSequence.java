package neetcode.arrays_and_hashing;

import java.util.HashMap;

public class S9LongestConsecutiveSequence {
    public static void main(String[] args) {
        int nums[] = {100,4,200,1,3,2};
        System.out.println("Longest consecutive sequence : "+longestConsecutiveSequence(nums));
    }

    public static int longestConsecutiveSequence(int[] nums){
        //initially visimap will have all false as its value, as we didnot visit any key
        HashMap<Integer, Boolean> visitMap = new HashMap<>();
        for (int num : nums) {
            visitMap.put(num, false);
        }
        int globalMax = 0;

        for (int key : visitMap.keySet()) {
            int currentMax = 1;
            int lookFor = key;
            visitMap.put(lookFor,true);

            while(visitMap.get(++lookFor) != null){
                currentMax++;
                visitMap.put(lookFor,true);
            }
            lookFor = key;
            while(visitMap.get(--lookFor) != null){
                currentMax++;
                visitMap.put(lookFor,true);
            }

            globalMax = Math.max(globalMax, currentMax);
        }
        return globalMax;
    }
}
