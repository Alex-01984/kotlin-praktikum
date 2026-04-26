fun main() {
    val day = 5
    // Нечётные дни (1, 3, 5...) → руки и пресс. Чётные → ноги и спина.
    val isHandsAbsDay = day % 2 != 0
    val isLegsBackDay = !isHandsAbsDay

    println(
            "Упражнения для рук: $isHandsAbsDay\nУпражнения для ног: $isLegsBackDay\nУпражнения для спины: $isLegsBackDay\nУпражнения для пресса: $isHandsAbsDay"
    )
}
