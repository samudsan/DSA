package neetcode.arrays_and_hashing;

import java.util.HashSet;

public class S9LongestConseutiveSequenceBest {
    public static void main(String[] args) {
        int nums[] = {100,4,200,1,3,2};
        System.out.println("Longest consecutive sequence : "+longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int num:nums) hs.add(num);
        int longest =1;
        for(int num: nums ){
            //check if the num is the start of a sequence by checking if left exists
            if(!hs.contains(num-1)){ // start of a sequence
                int count =1;
                while(hs.contains(num + 1)){ // check if hs contains next no.
                    num++;
                    count++;
                }
                longest = Math.max(longest, count);

            }
            // to iterating through every sequence.
            if(longest > nums.length/2) break;

        }
        return longest;
    }
}
