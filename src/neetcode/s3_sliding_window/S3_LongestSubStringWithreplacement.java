package neetcode.s3_sliding_window;

public class S3_LongestSubStringWithreplacement {
    public static void main(String[] args) {
        String s = "AAABABB";
        int k = 2;
        int[] arr = new int[26];
        int ans = 0;
        int max = 0;
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            arr[s.charAt(j) - 'A']++;
            max = Math.max(max, arr[s.charAt(j) - 'A']);
            if (j - i + 1 - max > k) {
                arr[s.charAt(i) - 'A']--;
                i++;
            }
            ans = Math.max(ans, j - i + 1);
        }
        System.out.println(ans);
    }
}

