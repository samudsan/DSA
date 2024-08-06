package neetcode.stack;

import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        String input = "{{";
        System.out.println(isValidParantheses(input));

    }
    public static String isValidParantheses(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(' || input.charAt(i) == '[' || input.charAt(i) == '{')
                stack.push(input.charAt(i));
            else if (stack.empty())
                return "NOT Valid parantheses";
            else {
                char top = stack.peek();
                if (top == '(' && input.charAt(i) == ')')
                    stack.pop();
                else if (top == '[' && input.charAt(i) == ']')
                    stack.pop();
                else if (top == '{' && input.charAt(i) == '}')
                    stack.pop();
                else
                    return "NOT Valid parantheses";
            }
        }
        if (stack.empty())
            return "Valid Paranthese";
        return "NOT valid parantheses";
    }
}
