package neetcode.arrays_and_hashing;

import java.util.*;

public class S4TopKFrequentElementsBest {
    public static void main(String[] args) {
        int nums[] = new int[]{1,1,2,1,3,2,3,4,4};
        System.out.println(Arrays.toString(getTopkFrequentElement(nums,2)));
    }

    private static int[] getTopkFrequentElement(int[] nums, int k) {

        HashMap<Integer, Integer> frequencyMap =  new HashMap<>();
        //creating an array of arraylists.
        List<Integer> bucket[] = new ArrayList[nums.length+1];
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0)+1);
        }
        System.out.println(frequencyMap);

        // we are adding keys to arraylist where its frequency acts as an index.
        // if 1 appear 3 times, at index 3 we will add 1,
        // if 2 also appears 3 times, at index 3 we will have 1 and 3.
        for(int key : frequencyMap.keySet()){
            int frequency = frequencyMap.get(key);
            if (bucket[frequency] == null)
                bucket[frequency] = new ArrayList<>();
            bucket[frequency].add(key);
        }

        // From buckets array we will read from right side.
        // if number of element in result matches k, then we stop further processing buckets array and return results array
        int index = 0;
        int results[] = new int[k];
        for (int i=nums.length; i>=0 ; i--)
            if(bucket[i] != null)
                for(int value : bucket[i]){
                    results[index++] = value;
                    if(index == k)
                        return results;
                }
        return results;
    }
}
