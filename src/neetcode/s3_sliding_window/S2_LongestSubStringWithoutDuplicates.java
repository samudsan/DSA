package neetcode.s3_sliding_window;

import java.util.HashSet;

public class S2_LongestSubStringWithoutDuplicates {
    public static void main(String[] args) {
        String s = "xyyzp77xyyzi";
        int max = 0;
        int p1 = 0, p2 = 0;
        HashSet<Character> set = new HashSet<>();
        while (p2 < s.length()) {
            if (!set.contains(s.charAt(p2))) {
                set.add(s.charAt(p2));
                p2++;
                max = Math.max(set.size(), max);
            } else { // if we get any duplicate, this will execute till it removes all elements from set and tries to form new set
                set.remove(s.charAt(p1));
                p1++;
            }
        }
        System.out.println(max);
    }
}


// Hashset does not preserve insertion order, so to remove any element from hashset we need to remove using its elements instead of index
// To get hashset elements sorted, we either need to use tree set or add all hashset elements to arraylist then sort arraylist

