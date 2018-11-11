import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class KataTest {
    @Test
    public void goodLuck() {
        assertArrayEquals(Kata.maxMatch("goodluck"), new String[] { "good", "luck" });
    }

    @Test
    public void invalidWord() {
        assertArrayEquals(Kata.maxMatch("ewingsa"), new String[] { "e", "w", "in", "g", "s", "a" });
    }
}