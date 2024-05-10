package neetcode.s1_arrays_and_hashing;

import java.util.*;

public class S4TopKFrequentElements {



    public static void main(String[] args) {
        int nums[] = new int[]{1,1,2,1,3,2,3,4,4};
        System.out.println(Arrays.toString(getTopkFrequentElement(nums,2)));
    }

    private static int[] getTopkFrequentElement(int[] nums, int k) {
        int[] arr = new int[k]; // to store the output array with topk frequent elements
        //Creating a frequency Map
        Map<Integer, Integer> frequncyMap  = new HashMap<>();
        for (int num : nums) {
            frequncyMap.put(num, frequncyMap.getOrDefault(num, 0) +1);
        }
        System.out.println(frequncyMap);
        // Creating Priority Queue
        PriorityQueue<Map.Entry<Integer, Integer>> pq =new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());

        for(Map.Entry<Integer, Integer> entry : frequncyMap.entrySet()){
            pq.add(entry);
            if(pq.size() > k)
                pq.poll();
            System.out.println(pq);
        }


        int i=k;
        while(!pq.isEmpty())
            arr[--i] = pq.poll().getKey();
        return arr;
    }
}
