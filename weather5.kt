const val KELVIN_CELSIUS = 273

class Weather5(val dayK: Int, val nightK: Int, val hasPrecipitation: Boolean)

fun main() {
    val weatherList = mutableListOf<Weather5>()
    repeat(30) {
        val day = Weather5((270..295).random(), (265..285).random(), listOf(true, false).random())
        weatherList.add(day)
    }
    val dayTemps = weatherList.map { it.dayK - KELVIN_CELSIUS }
    val nightTemps = weatherList.map { it.nightK - KELVIN_CELSIUS }
    val rainyDays = weatherList.count { it.hasPrecipitation }
    val avgDay = dayTemps.average()
    val avgNight = nightTemps.average()

    println("Средняя дневная: $avgDay°C, Средняя ночная: $avgNight°C, Дней с осадками: $rainyDays")
}
