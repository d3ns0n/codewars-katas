import io.kotest.matchers.longs.shouldBeExactly
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import solution.nextBiggerNumber
import java.util.stream.Stream


class NextBiggerNumberTest {

    companion object {
        @JvmStatic
        private fun provideArgumentsForNextBiggerNumber(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(9, -1),
                Arguments.of(12, 21),
                Arguments.of(513, 531),
                Arguments.of(2017, 2071),
                Arguments.of(2043, 2304),
                Arguments.of(414, 441),
                Arguments.of(144, 414),
                Arguments.of(1267550433, 1267553034),
                Arguments.of(1234567890, 1234567908),
                Arguments.of(549267986, 549268679),
                Arguments.of(119743072, 119743207)
            )
        }
    }

    @ParameterizedTest(name = "formatDuration({0}) should be equal to {1}")
    @MethodSource("provideArgumentsForNextBiggerNumber")
    fun `test nextBiggerNumber()`(input: Long, expected: Long) {
        nextBiggerNumber(input) shouldBeExactly expected
    }

}