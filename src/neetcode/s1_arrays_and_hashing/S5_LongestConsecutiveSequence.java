package neetcode.s1_arrays_and_hashing;

import java.util.*;

public class S5_LongestConsecutiveSequence {
    public static void main(String[] args) {
        int nums[] = new int[]{9,1,4,7,3,-1,0,5,8,-1,6};
        System.out.println(getlLogestConsecutiveSeq(nums));
    }

    private static int getlLogestConsecutiveSeq(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i: nums) {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        System.out.println(map);

        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry:map.entrySet()) {
           list.add(entry.getKey());
        }
        System.out.println(list);

        int refElement=list.get(0), localMax=1, globalMax=0;
        for (int i = 1; i < list.size(); i++) {
            if(refElement +1 == list.get(i)) {
                localMax++;
                refElement = list.get(i);
            }
            else {
                localMax = 1;
                refElement = list.get(i);
            }
            if(localMax > globalMax)
                globalMax = localMax;
        }
        return globalMax;

    }
}
