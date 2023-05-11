package neetcode.arrays_and_hashing;

import java.util.*;

public class S3GroupAnagrams {
    public static void main(String[] args) {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(str));
    }
/*This problem is solved using charCountSequence of each word,
Logic is we solved it using hashmap where key is charCountSequence and values would be list of strings which has same char sequence.
* */
    private static ArrayList<ArrayList> groupAnagrams(String[] strArray){

        HashMap<String, ArrayList> hm = new HashMap<>();
        ArrayList<String> strList = new ArrayList<>();

        for(String s: strArray) {
            String charCountSeq = "";
            int store[] = new int[26];

            for (int i = 0; i < s.length(); i++) {
                store[s.charAt(i) - 'a']++;
            }
            charCountSeq = Arrays.toString(store);
            if (hm.get(charCountSeq)== null) {
                ArrayList<String> al = new ArrayList<>();
                al.add(s);
                hm.put(charCountSeq, al);
            }
            else {
                strList = hm.get(charCountSeq);
                strList.add(s);
                hm.put(charCountSeq, strList);
            }
        }
        ArrayList<ArrayList> finalList = new ArrayList<>();
        for (Map.Entry<String, ArrayList> entry: hm.entrySet()) {
            finalList.add(entry.getValue());
        }
    return finalList;
    }

}
