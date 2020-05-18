import io.kotest.matchers.comparables.shouldBeEqualComparingTo
import io.kotest.matchers.ints.shouldBeExactly
import org.junit.jupiter.api.Test

class TimeFormatterTest {

    @Test
    fun `formatDuration(0) should be "now"`() {
        TimeFormatter.formatDuration(0) shouldBeEqualComparingTo "now"
    }

    @Test
    fun `formatDuration(1) should be "1 second"`() {
        TimeFormatter.formatDuration(1) shouldBeEqualComparingTo "1 second"
    }

    @Test
    fun `formatDuration(62) should be "1 minute and 2 seconds"`() {
        TimeFormatter.formatDuration(62) shouldBeEqualComparingTo "1 minute and 2 seconds"
    }

    @Test
    fun `formatDuration(120) should be "2 minutes"`() {
        TimeFormatter.formatDuration(120) shouldBeEqualComparingTo "2 minutes"
    }

   @Test
    fun `formatDuration(3600) should be "1 hour"`() {
        TimeFormatter.formatDuration(3600) shouldBeEqualComparingTo "1 hour"
    }

   @Test
    fun `formatDuration(3662) should be "1 hour, 1 minute and 2 seconds"`() {
        TimeFormatter.formatDuration(3662) shouldBeEqualComparingTo "1 hour, 1 minute and 2 seconds"
    }

}