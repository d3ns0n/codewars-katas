package bouncing

fun bouncingBall(h: Double, bounce: Double, window: Double): Int {
    if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) return -1

    return bouncingBall(h * bounce, bounce, window, 1)
}

tailrec fun bouncingBall(h: Double, bounce: Double, window: Double, counter: Int): Int {
    if (h <= window) return counter

    return bouncingBall(h * bounce, bounce, window, counter + 2)
}