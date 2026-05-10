const val KELVIN_TO_CELSIUS = 273

class Weather4(dayK: Int, nightK: Int, hasPrecipitation: Boolean) {
    val dayTemperature: Int = dayK - KELVIN_TO_CELSIUS
    val nightTemperature: Int = nightK - KELVIN_TO_CELSIUS
    val precipitation: Boolean = hasPrecipitation

    init {
        println("Дневная: $dayTemperature°C, Ночная: $nightTemperature°C, Осадки: $precipitation")
    }
}

fun main() {
    Weather4(293, 283, true)
}
