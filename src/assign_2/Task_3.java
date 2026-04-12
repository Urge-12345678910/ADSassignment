package assign_2;
import java.util.Stack;
public class Task_3 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            else {
                if (stack.isEmpty()) return false;
                char t = stack.pop();
                if (c == ')' && t != '(') return false;
                if (c == ']' && t != '[') return false;
                if (c == '}' && t != '{') return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("{[]}"));
    }
}
