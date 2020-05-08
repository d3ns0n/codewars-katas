import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class JosephusSurvivorKtTest {

    @Test
    fun basicTests1() {
        assertEquals(4, josephusSurvivor(7, 3))
    }

    @Test
    fun basicTests2() {
        assertEquals(10, josephusSurvivor(11, 19))
    }

    @Test
    fun basicTests3() {
        assertEquals(28, josephusSurvivor(40, 3))
    }

    @Test
    fun basicTests4() {
        assertEquals(13, josephusSurvivor(14, 2))
    }

    @Test
    fun basicTests5() {
        assertEquals(100, josephusSurvivor(100, 1))
    }

    @Test
    fun basicTests6() {
        assertEquals(1, josephusSurvivor(1, 300))
    }

    @Test
    fun basicTests7() {
        assertEquals(1, josephusSurvivor(2, 300))
    }

    @Test
    fun basicTests8() {
        assertEquals(1, josephusSurvivor(5, 300))
    }

    @Test
    fun basicTests9() {
        assertEquals(7, josephusSurvivor(7, 300))
    }

    @Test
    fun basicTests10() {
        assertEquals(265, josephusSurvivor(300, 300))
    }

}