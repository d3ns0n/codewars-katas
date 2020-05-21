package solution

fun nextBiggerNumber(n: Long): Long {
    return nextBiggerNumber(n.toString(), 2)?.toLong() ?: -1
}

private tailrec fun nextBiggerNumber(number: String, length: Int): String? {
    if (length > number.length) return null

    val index = number.length - length
    val sortedDigits = number.substring((index until number.length)).toSortedIntList()
    val foundNumber = sortedDigits.pop(number[index].toDigit())
        ?.let { number.substring(0 until index) + it + sortedDigits.joinToString("") }

    return foundNumber ?: nextBiggerNumber(number, length + 1)
}

fun String.toSortedIntList() = this.toList().map { it.toDigit() }.sorted().toMutableList()

fun MutableList<Int>.pop(number: Int) = this.find { it > number }?.also { this.remove(it) }

fun Char.toDigit() = this.toString().toInt()
