package neetcode.s3_sliding_window;

public class S3_LongestSubStringWithKReplacement {
    /*
    * Problem: Find the length of the longest substring where you can replace up to k characters to make all characters the same.
    * Approach: Use a sliding window with character frequency tracking to determine the maximum length of such a substring by adjusting
    * the window size based on the number of replacements needed.*/
    public static void main(String[] args) {
        String s = "AAABABB";  // Input string
        int k = 2;             // Maximum replacements allowed
        int[] count = new int[26];
        int maxCount = 0, maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            maxCount = Math.max(maxCount, ++count[s.charAt(right) - 'A']);

            // If we need to replace more than k characters, move left
            while (right - left + 1 - maxCount > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }
        System.out.println(maxLength); // Print the length of the longest valid substring
    }
}

