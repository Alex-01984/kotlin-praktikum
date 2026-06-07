abstract class WeatherStationStats

class Temperature(val degrees: Double) : WeatherStationStats()

// Количество осадков
class PrecipitationAmount(val millimeters: Double) : WeatherStationStats()

class WeatherServer {
    fun sendData(stats: WeatherStationStats) {
        when (stats) {
            is Temperature -> {
                println("Отправляю на сервер температуру: ${stats.degrees} C")
            }
            is PrecipitationAmount -> {
                println("Отправляю на сервер количество осадков: ${stats.millimeters} мм.")
            }
            else -> {
                println("Неизвестный тип данных.")
            }
        }
    }
}

fun main() {
    val server = WeatherServer()
    val temperature = Temperature(23.5)
    val precipitation = PrecipitationAmount(15.0)
    server.sendData(temperature)
    server.sendData(precipitation)
}
