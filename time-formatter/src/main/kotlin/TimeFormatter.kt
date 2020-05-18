import kotlin.streams.toList

object TimeFormatter {

    fun formatDuration(seconds: Int): String {
        if (seconds == 0) return "now"

        val toMinutes = 60
        val toHours = toMinutes * 60
        val toDays = toHours * 24
        val toYears = toDays * 365

        val years = seconds / toYears
        val days = (seconds - years * toYears) / toDays
        val hours = (seconds - years * toYears - days * toDays) / toHours
        val minutes = (seconds - years * toYears - days * toDays - hours * toHours) / toMinutes
        val secs = seconds - years * toYears - days * toDays - hours * toHours - minutes * toMinutes

        return listOf("year" to years, "day" to days, "hour" to hours, "minute" to minutes, "second" to secs)
            .stream()
            .filter { it.second != 0 }
            .map { if (it.second > 1) it.first + "s" to it.second else it }
            .map { "${it.second} ${it.first}" }
            .toList().joinToString(", ")
            .reversed().replaceFirst(" ,", " dna ").reversed()
    }

}