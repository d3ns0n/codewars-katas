fun josephusSurvivor(n: Int, k: Int): Int {
    return josephusSurvivor((1 .. n).toList(), k)
}

tailrec fun josephusSurvivor(survivors: List<Int>, k: Int): Int {
    if (survivors.size == 1) {
        return survivors.first()
    }

    val killIndex = if (k % survivors.size == 0) survivors.size - 1 else (k % survivors.size) - 1
    val leftSurvivors = survivors.subList(killIndex + 1, survivors.size) + survivors.subList(0, killIndex)

    return josephusSurvivor(leftSurvivors, k)
}