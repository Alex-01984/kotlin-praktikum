const val KELVIN_TO_CELSIUS = 273

class Weather4(val dayK: Int, val nightK: Int, val hasPrecipitation: Boolean) {
    init {
        println(
            "Дневная: ${dayK - KELVIN_TO_CELSIUS}°C, Ночная: ${nightK - KELVIN_TO_CELSIUS}°C, Осадки: $hasPrecipitation",
        )
    }
}

fun main() {
    Weather4(293, 283, true)
}
