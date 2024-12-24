package neetcode.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class S6_TopKFrequestWords {
    public static void main(String[] args) {
        List<String> topWords = getTopKFrequentWords(new String[]{"i","love","leetcode","i","love","coding"}, 2);
        System.out.println(topWords);
    }

    public static List<String> getTopKFrequentWords(String words[], int k){
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        for(String word : words){
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0)+1);
        }

        List<String> aList = new ArrayList<>(frequencyMap.keySet());
        Collections.sort(aList, (w1,w2) -> {
            if(frequencyMap.get(w1) != frequencyMap.get(w2))
                return frequencyMap.get(w2) - frequencyMap.get(w1);
            else
                return w1.compareTo(w2);
        });
        return aList.subList(0, k);
    }
}


