package from_2600_to_2800;

import java.util.Stack;

public class LeetCode_2696 {
    public static void main(String[] args) {
        String s = "ABFCACDB";
        System.out.println(minLength(s));
    }

    public static int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'B' && s.charAt(i) != 'D') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    stack.push(s.charAt(i));
                } else if (!stack.isEmpty() && s.charAt(i) == 'B' && stack.peek() == 'A') {
                    stack.pop();
                } else if (!stack.isEmpty() && s.charAt(i) == 'D' && stack.peek() == 'C') {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            }
            System.out.println(stack);
        }
        return stack.size();
    }
}
