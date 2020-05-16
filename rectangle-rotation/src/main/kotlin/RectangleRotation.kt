import kotlin.math.sqrt

fun rectangleRotation(a: Int, b: Int): Int {
    val aHalfBisect = (a / sqrt(2.0)) / 2
    val bHalfBisect = (b / sqrt(2.0)) / 2

    val firstRectangle = arrayOf(aHalfBisect.toInt() * 2 + 1, bHalfBisect.toInt() * 2 + 1)
    val secondRectangle = Array(2) { 0 }

    when {
        aHalfBisect - aHalfBisect.toInt() < 0.5 -> secondRectangle[0] = firstRectangle[0] - 1
        else -> secondRectangle[0] = firstRectangle[0] + 1
    }

    when {
        bHalfBisect - bHalfBisect.toInt() < 0.5 -> secondRectangle[1] = firstRectangle[1] - 1
        else -> secondRectangle[1] = firstRectangle[1] + 1
    }

    return firstRectangle.first() * firstRectangle.last() + secondRectangle.first() * secondRectangle.last()
}