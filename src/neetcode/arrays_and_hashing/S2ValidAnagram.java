package neetcode.arrays_and_hashing;

import java.util.HashMap;
import java.util.Map;

public class S2ValidAnagram {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "a";
        boolean results = isValidAnagram(s1,s2);
        System.out.println(results);
    }

    private static boolean isValidAnagram(String s1, String s2) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char ch: s1.toCharArray()) {
            if(hm.containsKey(ch))
                hm.put(ch, hm.get(ch)+1);
            else hm.put(ch, 1);
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
