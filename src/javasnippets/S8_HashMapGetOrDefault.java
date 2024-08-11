package javasnippets;

import java.util.HashMap;
import java.util.Map;

public class S8_HashMapGetOrDefault {
    public static void main(String[] args) {
        int nums[] = new int[]{1,1,2,1,3,2,3,4,4,4};
        HashMap<Integer, Integer> frequencyCountMap = new HashMap<>();
        // building frequency map in one line
        for(int num : nums){
            frequencyCountMap.put(num, frequencyCountMap.getOrDefault(num, 0)+1);
        }

        for(Map.Entry entry : frequencyCountMap.entrySet()){ // to use entry set we need to convert map to entryset
            //System.out.println(entry.getKey() + " " + entry.getValue());
            System.out.println(entry.toString()); // to directly print each entry in the map
        }


    }
}
