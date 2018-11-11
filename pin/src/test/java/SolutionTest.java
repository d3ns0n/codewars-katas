import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    public void validPins() {
        assertEquals(true, Solution.validatePin("1234"));
        assertEquals(true, Solution.validatePin("0000"));
        assertEquals(true, Solution.validatePin("1111"));
        assertEquals(true, Solution.validatePin("123456"));
        assertEquals(true, Solution.validatePin("098765"));
        assertEquals(true, Solution.validatePin("000000"));
        assertEquals(true, Solution.validatePin("090909"));
    }

    @Test
    public void nonDigitCharacters() {
        assertEquals(false, Solution.validatePin("a234"));
        assertEquals(false, Solution.validatePin(".234"));
    }

    @Test
    public void invalidLengths() {
        assertEquals(false, Solution.validatePin("1"));
        assertEquals(false, Solution.validatePin("12"));
        assertEquals(false, Solution.validatePin("123"));
        assertEquals(false, Solution.validatePin("12345"));
        assertEquals(false, Solution.validatePin("1234567"));
        assertEquals(false, Solution.validatePin("-1234"));
        assertEquals(false, Solution.validatePin("1.234"));
        assertEquals(false, Solution.validatePin("00000000"));
    }

    @Test
    public void additionalNonDigitCharacters() {
        assertEquals(false, Solution.validatePin("abc1234"));
        assertEquals(false, Solution.validatePin("1234xyz"));
        assertEquals(false, Solution.validatePin("abc1234xyz"));
        assertEquals(false, Solution.validatePin("abc123456"));
        assertEquals(false, Solution.validatePin("123456xyz"));
        assertEquals(false, Solution.validatePin("abc123456xyz"));
    }
}
