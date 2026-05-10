const val KELVIN_TO_CELSIUS_OFFSET = 273

class Weather3(dayK: Int, nightK: Int, hasPrecipitation: Boolean) {
    val dayTemperature: Int = dayK - KELVIN_TO_CELSIUS_OFFSET
    val nightTemperature: Int = nightK - KELVIN_TO_CELSIUS_OFFSET
    val precipitation: Boolean = hasPrecipitation

    fun printWeather() {
        println("Дневная: $dayTemperature°C, Ночная: $nightTemperature°C, Осадки: $precipitation")
    }
}

fun main() {
    val day1 = Weather3(293, 283, true)
    day1.printWeather()
}
