package bouncing

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BouncingBallsKtTest {

    @Test
    fun test1() {
        assertThat(bouncingBall(3.0, 0.66, 1.5)).isEqualTo(3)
    }

    @Test
    fun test2() {
        assertThat(bouncingBall(30.0, 0.66, 1.5)).isEqualTo(15)
    }

}