package TT2.Stack;

import java.util.Stack;

public class infix_to_postfix {
    public static int preFe(char operator) {
        if (operator == '+' || operator == '-')
            return 1;
        else if (operator == '*' || operator == '/')
            return 2;
        else if (operator == '^')
            return 3;
        else
            return -1;

    }

    public static String pre_to_pos(String s, int n) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            } else {
                while (!stack.isEmpty() && preFe(ch) <= preFe(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    public static void main(String[] args) {
        String s = "a+9*c";
        int n = s.length();
        String res = pre_to_pos(s, n);
        System.out.println(res);

    }
}
