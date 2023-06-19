import java.util.Stack;

public class ValidSequence {
    public static boolean isSequenceValid(String sequence) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < sequence.length(); i++) {
            char c = sequence.charAt(i);

            if (c == '{') {
                stack.push(c);
            } else if (c == '}') {
                if (stack.isEmpty() || stack.peek() != '{') {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}