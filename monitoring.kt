const val REQUIRED_HUMIDITY = 20
const val SEASON_WINTER = "winter"

fun main() {
    // Инициализация согласно ТЗ с явным указанием типов
    val isSunny: Boolean = true
    val isTentOpen: Boolean = true
    val humidity: Int = 20
    val season: String = "winter"
    // Проверка: солнце И тент открыт И влажность 20 И НЕ зима
    val isFavorable =
            isSunny && isTentOpen && (humidity == REQUIRED_HUMIDITY) && (season != SEASON_WINTER)

    println("Благоприятные ли условия сейчас для роста бобовых? $isFavorable")
}
