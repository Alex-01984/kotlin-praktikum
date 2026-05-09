class Weather2(
    var dayTemperature: Float,
    var nightTemperature: Float,
    var precipitation: Boolean,
) {
    fun printWeather() {
        println("Дневная: $dayTemperature°C, Ночная: $nightTemperature°C, Осадки: $precipitation")
    }
}

fun main() {
    val day1 = Weather2(23.5f, 13.0f, true)
    day1.printWeather()
}
