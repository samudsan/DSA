package neetcode.s1_arrays_and_hashing;

import java.util.HashMap;
import java.util.Map;

public class S2ValidAnagram {
    public static void main(String[] args) {
        String s1 = "madam";
        String s2 = "admam";
        boolean results = isValidAnagram(s1,s2);
        System.out.println(results);
    }
/*
This problem can solved in two ways,
    one( approach) is creating an array of size 26 and incrmenting respective character index when an alphabet appears,
    and decreasing the respective index while reading second string. if array contains all zeros it is valid, otherwise not

    Second approach is, maintaining charSequence count of s1 and s2 in a hashmap and comparing both hashmaps, if both are same they are valid anagram otherwise not.
* */
    private static boolean isValidAnagram(String s1, String s2) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char ch: s1.toCharArray()) {
            if(hm.containsKey(ch))
                hm.put(ch, hm.get(ch)+1);
            else hm.put(ch, 1);
            // we can build frequency map/hm with one liner using hm.getOrDefault() method
            // hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }

        for (Map.Entry<Character, Integer> entry :hm.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println("");

        for (char ch: s2.toCharArray()) {
            if(hm.containsKey(ch))
                hm.put(ch, hm.get(ch)-1);
            else return false;
        }
        for (Map.Entry<Character, Integer> entry :hm.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        for (char ch: hm.keySet()) {
            if(hm.get(ch) != 0)
                return false;
        }
        return true;
    }
}



