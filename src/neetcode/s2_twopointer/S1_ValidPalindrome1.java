package neetcode.s2_twopointer;

public class S1_ValidPalindrome1 {
    public static void main(String[] args) {
        String s  = "A man, a plan, a canal: Panama";
        String s1 = "race a car";

        System.out.println("Input String is valid palindrome : "+isValidPalindrom(s));
    }

    public static boolean isValidPalindrom(String s){
        char charArr[] = s.toCharArray();
        String s1 = "";
        for (char ch:charArr) {
            if(Character.isLetterOrDigit(ch)){ //return true if ch is either a char or a digit
                s1+=ch+"";
            }
        }
        s1 = s1.toLowerCase();
        int i=0, j=s1.length()-1;
        while(i<j){
            if(s1.charAt(i)==s1.charAt(j)){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }

}
