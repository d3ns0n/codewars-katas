import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MorseCodeDecoderTest {

    @Test
    fun exampleTestCases() {
        assertEquals("HEY JUDE", decodeMorse(".... . -.--   .--- ..- -.. ."))
    }

}