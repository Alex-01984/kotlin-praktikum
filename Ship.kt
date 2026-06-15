class Ship(
    name: String,
    var averageSpeed: Double,
    var port: String,
) {
    var name: String = name
        set(value) {
            println("Предупреждение: Имя корабля менять нельзя!")
        }

    fun getInfo() {
        println("Корабль: $name имеет порт приписки: $port и среднюю скорость: $averageSpeed миль/час")
    }
}

fun main() {
    val ship = Ship("Варяг", 36.5, "Север")
    ship.getInfo()
    ship.name = "Варяг2"
    ship.getInfo()
}
