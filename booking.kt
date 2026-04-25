const val TOTAL_TABLES = 13

fun main() {
    val bookedToday = TOTAL_TABLES
    val bookedTomorrow = 9

    println(
            "[Доступность столиков на сегодня: ${bookedToday < TOTAL_TABLES}],\n[Доступность столиков на завтра: ${bookedTomorrow < TOTAL_TABLES}]"
    )
}
