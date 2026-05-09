class Weather2(
    val dayTemperature: Float,
    val nightTemperature: Float,
    val precipitation: Boolean,
) {
    fun printWeather() {
        println("Дневная: $dayTemperature°C, Ночная: $nightTemperature°C, Осадки: $precipitation")
    }
}

fun main() {
    val day1 = Weather2(23.5f, 13.0f, true)
    day1.printWeather()
}
