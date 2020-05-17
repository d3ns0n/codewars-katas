import kotlin.math.log2

fun nextHigher(n: Int): Int {
    if (log2(n.toDouble()) - log2(n.toDouble()).toInt() == 0.0) {
        return n shl 1
    }

    var nextHigherNumber = n + 1
    while (numberOf1Bits(n) != numberOf1Bits(nextHigherNumber)) {
        nextHigherNumber++
    }

    return nextHigherNumber
}

fun numberOf1Bits(n: Int) = n.toString(2).count { it == '1' }