package neetcode.twopointer;

public class S1_ValidPalindrom {
    public static void main(String[] args) {
        String s = "race a car";

        System.out.println(isValidPalindrom(s));
    }

    private static boolean isValidPalindrom(String s) {
        String alpha = "abcdefghijklmnopqrstuvwxyz0123456789";
        String s1 = "";
        s = s.toLowerCase();
        char charArray[] = s.toCharArray();
        for(char ch: charArray){
            if(alpha.contains(ch+"")) {
                s1=s1+ch;
            }
        }
        System.out.println(s1);

        int i=0, j = s1.length()-1;
        while(i<j){
            if(s1.charAt(i) == s1.charAt(j)) {
                i++;
                j--;
            }
            else
                return false;
        }
        return true;
    }
}
