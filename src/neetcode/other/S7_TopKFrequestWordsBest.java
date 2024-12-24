package neetcode.other;

import java.util.*;

public class S7_TopKFrequestWordsBest {
    public static void main(String[] args) {
        List<String> topWords = getTopKFrequentWords(new String[]{"i","love","leetcode","i","love","coding"}, 2);
        System.out.println(topWords);
    }

    public static List<String> getTopKFrequentWords(String words[], int k){
        // Step 1: Build the frequency map
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        for(String word : words){
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        // Step 2: Create a priority queue with custom comparator (min-heap)
        PriorityQueue<String> minheap = new PriorityQueue<>(
                (w1, w2) -> frequencyMap.get(w1) != frequencyMap.get(w2)
                        ? frequencyMap.get(w1) - frequencyMap.get(w2)
                        : w2.compareTo(w1) // Sort in reverse lexicographical order if frequencies are the same
        );

        // Step 3: Build the priority queue
        for (String word : frequencyMap.keySet()){
            minheap.offer(word); // Add each word into the priority queue
            if(minheap.size() > k) {
                minheap.poll(); // Remove the least frequent element if the size exceeds k
            }
        }

        // Step 4: Extract the elements from the min-heap into the result list
        List<String> result = new ArrayList<>();
        while(!minheap.isEmpty()){
            result.add(minheap.poll());
        }

        // Step 5: Reverse the result to get the highest frequencies first
        Collections.reverse(result);

        return result;
    }
}
