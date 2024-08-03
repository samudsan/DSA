package neetcode.s3_sliding_window;

public class S3_LongestSubStringWithKReplacement {
    /*
    * Problem: Find the length of the longest substring where you can replace up to k characters to make all characters the same.
    * Approach: Use a sliding window with character frequency tracking to determine the maximum length of such a substring by adjusting
    * the window size based on the number of replacements needed.*/
    public static void main(String[] args) {
        String s = "AAABABB";  // Input string
        int k = 2;             // Maximum replacements allowed
        int[] arr = new int[26]; // Array to count frequency of each character
        int ans = 0;          // Length of the longest valid substring found
        int max = 0;          // Maximum frequency of any single character in the current window
        int i = 0;            // Start index of the sliding window
        for (int j = 0; j < s.length(); j++) {
            int index = s.charAt(j) - 'A'; // Index for character frequency
            arr[index]++; // Update frequency of the current character
            max = Math.max(max, arr[index]); // Update maximum frequency within the window

            // Check if the current window size minus the maximum frequency is within allowed replacements
            if (j - i + 1 - max <= k) {
                ans = j - i + 1; // Update the answer with the current window size
            } else {
                // Shrink the window from the start
                arr[s.charAt(i) - 'A']--; // Remove the character at the start of the window
                i++; // Move the start index forward
            }
        }
        System.out.println(ans); // Print the length of the longest valid substring
    }
}

