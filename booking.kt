fun main() {
    val tables = 13
    val bookedToday = tables // 13 из 13 забронировано
    val bookedTomorrow = 9 // 9 из 13 забронировано

    println(
            "Доступность столиков на сегодня: ${bookedToday < tables}\nДоступность столиков на завтра: ${bookedTomorrow < tables}"
    )
}
