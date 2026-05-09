class Weather {
    var daytimeTemperature: Float = 15.0f
    var nightTemperature: Float = 5.0f
    var precipitation: Boolean = false

    fun printWeather() {
        println(
            "Дневная: $daytimeTemperature°C, Ночная: $nightTemperature°C, Осадки: $precipitation",
        )
    }
}

fun main() {
    val day1 = Weather()
    day1.daytimeTemperature = 22.5f
    day1.nightTemperature = 12.0f
    day1.precipitation = true

    val day2 = Weather()
    day2.daytimeTemperature = 18.0f
    day2.nightTemperature = 8.5f
    day2.precipitation = false

    day1.printWeather()
    day2.printWeather()
}
