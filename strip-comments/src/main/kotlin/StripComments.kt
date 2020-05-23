fun solution(input: String, markers: CharArray) =
    input.lines().joinToString("\n") { line -> line.split(*markers).first().trimEnd() }