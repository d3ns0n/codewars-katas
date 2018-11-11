import java.util.Stack;
import java.util.stream.Stream;

public class Solution {

    public static boolean isValid(String brackets) {
        Stack<Character> stack = new Stack<>();

        for (char bracket : brackets.toCharArray()) {
            if (isOpeningBracket(bracket)) {
                stack.push(bracket);
            } else if (!stack.isEmpty() && findBracket(bracket).opening == stack.peek()) {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.empty();
    }

    private static boolean isOpeningBracket(char bracket) {
        return Stream.of(Brackets.values()).anyMatch(brackets -> brackets.opening == bracket);
    }

    private static Brackets findBracket(char bracket) {
        return Stream.of(Brackets.values())
                .filter(brackets -> brackets.opening == bracket || brackets.closing == bracket)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    enum Brackets {

        ROUND_BRACKETS('(', ')'),
        SQUARE_BRACKETS('[', ']'),
        CURLY_BRACKETS('{', '}');

        private char opening;
        private char closing;

        Brackets(char opening, char closing) {
            this.opening = opening;
            this.closing = closing;
        }
    }

}
