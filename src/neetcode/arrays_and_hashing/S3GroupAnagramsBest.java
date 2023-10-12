package neetcode.arrays_and_hashing;

import java.util.*;

public class S3GroupAnagramsBest {
    public static void main(String[] args) {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(str));
    }


    /*This problem is solved using charCountSequence of each word,
    Logic is we solved it using hashmap where key is charCountSequence and values would be list of strings which has same char sequence.
    Second(Best): we can also sort our strings and update hashmap key with sorted version and value with list of strings which has same sorting order.
    * */
    private static ArrayList<ArrayList> groupAnagrams(String[] strs){

        HashMap<String, ArrayList> hm = new HashMap<>();
        ArrayList<String> strList;

        for(String word: strs) {
            char[] c = word.toCharArray();        // convert to array of chars
            java.util.Arrays.sort(c);          // sort
            String sortedWord = new String(c);  // convert back to String


            if (hm.get(sortedWord)== null) {
                ArrayList<String> al = new ArrayList<>();
                al.add(word);
                hm.put(sortedWord, al);
            }
            else {
                strList = hm.get(sortedWord);
                strList.add(word);
                hm.put(sortedWord, strList);
            }
        }
        ArrayList<ArrayList> finalList = new ArrayList<>();
        for (Map.Entry<String, ArrayList> entry: hm.entrySet()) {
            finalList.add(entry.getValue());
        }
        return finalList;
    }

}
