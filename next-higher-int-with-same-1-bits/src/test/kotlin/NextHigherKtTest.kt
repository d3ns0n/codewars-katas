import io.kotest.matchers.ints.shouldBeExactly
import org.junit.jupiter.api.Test

class NextHigherKtTest {

    @Test
    fun `nextHigher(128) should be 256`() = nextHigher(128) shouldBeExactly 256

    @Test
    fun `nextHigher(1) should be 2`() = nextHigher(1) shouldBeExactly 2


    @Test
    fun `nextHigher(1022) should be 1279`() = nextHigher(1022) shouldBeExactly 1279


    @Test
    fun `nextHigher(127) should be 191`() = nextHigher(127) shouldBeExactly 191

    @Test
    fun `nextHigher(1253343) should be 1253359`() = nextHigher(1253343) shouldBeExactly 1253359

}