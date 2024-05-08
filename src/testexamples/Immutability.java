package testexamples;

class Immutability {
    public static void main(String[] args) {
        String text = " Cut string";
// The trim function is meant to eliminate leading & trailing spaces
        text.trim();
// Without assigning the text variable to the trimmed string
        System.out.println(text);
// Assigning trimmed string to the variable
        text = text.trim();
        System.out.println(text);
    }
}
