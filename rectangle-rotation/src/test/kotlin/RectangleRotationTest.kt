import io.kotest.matchers.ints.shouldBeExactly
import org.junit.jupiter.api.Test

class RectangleRotationTest {

    @Test
    fun `rectangle with a=6 and b=4 should contain 23 points with integer coordinates`() {
        rectangleRotation(6, 4) shouldBeExactly 23
    }

    @Test
    fun `rectangle with a=4 and b=6 should contain 23 points with integer coordinates`() {
        rectangleRotation(4, 6) shouldBeExactly 23
    }

    @Test
    fun `rectangle with a=30 and b=2 should contain 65 points with integer coordinates`() {
        rectangleRotation(30, 2) shouldBeExactly 65
    }

    @Test
    fun `rectangle with a=8 and b=6 should contain 49 points with integer coordinates`() {
        rectangleRotation(8, 6) shouldBeExactly 49
    }

    @Test
    fun `rectangle with a=16 and b=20 should contain 333 points with integer coordinates`() {
        rectangleRotation(16, 20) shouldBeExactly 333
    }

}