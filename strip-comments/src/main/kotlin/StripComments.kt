import kotlin.streams.toList

fun solution(input: String, markers: CharArray): String {
    val lineBreak = "\n"

    return input.split(lineBreak).stream()
        .map { stripComment(it, markers) }
        .map { it.trim() }
        .toList().joinToString(lineBreak)
}

fun stripComment(input: String, markers: CharArray): String {
    for(marker in markers) {
        val indexOf = input.indexOf(marker)
        if (indexOf != -1) return input.substring(0 until indexOf)
    }

    return input
}
