import kotlin.random.Random

const val KELVIN_CELSIUS = 273

class Weather5(val dayK: Int, val nightK: Int, val hasPrecipitation: Boolean)

fun main() {
    val weatherList =
        List(30) {
            Weather5(
                dayK = (270..295).random(),
                nightK = (265..285).random(),
                hasPrecipitation = Random.nextBoolean(),
            )
        }

    val dayTemps = weatherList.map { it.dayK - KELVIN_CELSIUS }
    val nightTemps = weatherList.map { it.nightK - KELVIN_CELSIUS }
    val rainyDays = weatherList.count { it.hasPrecipitation }
    val avgDay = dayTemps.average()
    val avgNight = nightTemps.average()

    println("Средняя дневная: $avgDay°C, Средняя ночная: $avgNight°C, Дней с осадками: $rainyDays")
}
