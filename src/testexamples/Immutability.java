package testexamples;

import java.util.HashMap;

class Immutability {
    public static void main(String[] args) {
        int nums[] = new int[]{1,1,2,1,3,2,3,4,4,4};
        HashMap<Integer, Integer> frequencyCountMap = new HashMap<>();
        for(int num : nums){
            frequencyCountMap.put(num, frequencyCountMap.getOrDefault(num, 0)+1);
        }

    }
}
