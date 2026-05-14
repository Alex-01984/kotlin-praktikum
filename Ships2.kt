open class Liner2 {
    open val speed: Int = 60
    open val passengerCapacity: Int = 200
    open val cargoCapacity: Int = 250

    fun extendsRamp() {
        println("Способен выдвигать горизонтальный трап со шкафута.")
    }

    open fun infoShips() {
        println(
            "Характеристика лайнера:\nСкорость: $speed\nКоличество пассажиров: $passengerCapacity\nГрузоподъемность: $cargoCapacity",
        )
    }
}

class CargoShip2 : Liner2() {
    override val speed: Int = 40
    override val passengerCapacity: Int = 40
    override val cargoCapacity: Int = 600

    fun loadingCrane() {
        println("Способен активировать погрузочный кран.")
    }

    override fun infoShips() {
        println(
            "Характеристика грузового корабля:\nСкорость: $speed\nКоличество пассажиров: $passengerCapacity\nГрузоподъемность: $cargoCapacity",
        )
    }
}

class IceBreaker2 : Liner2() {
    override val speed: Int = 25
    override val passengerCapacity: Int = 35
    val canBreakIce: Boolean = true

    fun opensGate() {
        println("Способен открывать ворота со стороны кормы.")
    }

    override fun infoShips() {
        println("Характеристика ледокола:\nСкорость: $speed\nКоличество пассажиров: $passengerCapacity")
    }
}

fun main() {
    val liner = Liner2()
    liner.infoShips()
    liner.extendsRamp()

    val cargoShip = CargoShip2()
    cargoShip.infoShips()
    cargoShip.loadingCrane()

    val iceBreaker = IceBreaker2()
    iceBreaker.infoShips()
    iceBreaker.opensGate()
}
