const val TOTAL_TABLES = 13

fun main() {
    // Данные из условия: сегодня забронировано 13 столов (явное значение!)
    val bookedToday = 13
    val bookedTomorrow = 9

    println(
            "[Доступность столиков на сегодня: ${bookedToday < TOTAL_TABLES}],\n[Доступность столиков на завтра: ${bookedTomorrow < TOTAL_TABLES}]"
    )
}
