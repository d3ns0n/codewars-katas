import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void brackets_opening_and_closing_in_order() {
        assertThat(Solution.isValid("(){}[]")).isTrue();
    }

    @Test
    void brackets_opening_and_closing_nested() {
        assertThat(Solution.isValid("([{}])")).isTrue();
    }

    @Test
    void brackets_opening_without_closing() {
        assertThat(Solution.isValid("(}")).isFalse();
    }

    @Test
    void brackets_opening_and_closing_in_wrong_order() {
        assertThat(Solution.isValid("[(])")).isFalse();
    }

    @Test
    void wrong_closing_bracket() {
        assertThat(Solution.isValid("[({})](]")).isFalse();
    }

    @Test
    void only_closing_bracket() {
        assertThat(Solution.isValid(")")).isFalse();
    }

    @Test
    void wrong_number_of_closing_brackets() {
        assertThat(Solution.isValid("(})")).isFalse();
    }

}