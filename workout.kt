fun main() {
    val day = 5
    val isEvenDay = day % 2 == 0

    println(
            String.format(
                    "%-24s%s\n%-24s%s\n%-24s%s\n%-24s%s",
                    "Упражнения для рук:",
                    !isEvenDay,
                    "Упражнения для ног:",
                    isEvenDay,
                    "Упражнения для спины:",
                    isEvenDay,
                    "Упражнения для пресса:",
                    !isEvenDay
            )
    )
}
