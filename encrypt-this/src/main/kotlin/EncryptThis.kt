import kotlin.streams.toList

fun encryptThis(text: String) = text.split(" ").stream()
        .map { word ->
            when (word.length) {
                1 -> word.first().toInt()
                2 -> word.first().toInt().toString() + word.last()
                else -> word.first().toInt().toString() + word.last() + word.slice(2..word.length - 2) + word[1]
            }
        }.toList()
        .joinToString(" ")