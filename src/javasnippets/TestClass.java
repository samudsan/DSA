package javasnippets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestClass {
    public static void main(String[] args) {
        int nums[] = new int[]{1,1,1,1,2,2,2,2,2,2,2,3,3};
        int k = 2;
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        //Creating frequency map
	for(int i=0; i<nums.length; i++){
            frequencyMap.put(nums[i], frequencyMap.getOrDefault(nums[i], 0)+1);
        }
        ArrayList<Map.Entry<Integer, Integer>> entryArrayList = new ArrayList<>(frequencyMap.entrySet());
        entryArrayList.sort(Map.Entry.comparingByValue());

        // Sorted based on values: arraylist entries
        System.out.println("ArrayList entries sorted based on values"+entryArrayList);
        System.out.println("ArrayList Size"+entryArrayList.size());

        // As arrayList is already sorted we will get items in reverse order and add them into topK array
        int topK[] = new int[k];
        for(int i=0; i<k; i++) {
            topK[i] = entryArrayList.get(entryArrayList.size()-(i+1)).getKey();
            System.out.println(entryArrayList.get(entryArrayList.size()-(i+1)));
        }
        for(int i =0; i< topK.length; i++)
            System.out.println(topK[i]);
        }
    }


