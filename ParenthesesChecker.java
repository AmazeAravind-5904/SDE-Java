import java.util.Stack;
public class ParenthesesChecker {
    public static String checkBalancedParentheses(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return "Not Balanced";
                }
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            return "Balanced";
        } else {
            return "Not Balanced";
        }
    }
    public static void main(String[] args) {
        String str1 = "((()))()()";
        System.out.println(checkBalancedParentheses(str1));
    }
}
