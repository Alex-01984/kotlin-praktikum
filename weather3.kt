class Weather3(dayK: Int, nightK: Int, hasPrecipitation: Boolean) {
    // Поля объявлены и проинициализированы в ТЕЛЕ класса
    var dayTemperature: Int = dayK - 273
    var nightTemperature: Int = nightK - 273
    var precipitation: Boolean = hasPrecipitation

    fun printWeather() {
        println(
            "Дневная: $dayTemperature°C, Ночная: $nightTemperature°C, Осадки: $precipitation",
        )
    }
}

fun main() {
    // Данные передаём в конструктор (в Кельвинах)
    // 293K ≈ 20°C, 283K ≈ 10°C
    val day1 = Weather3(293, 283, true)

    day1.printWeather()
}
