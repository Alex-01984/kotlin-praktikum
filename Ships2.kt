open class Liner2 {
    open val speed: Int = 60
    open val passengerCapacity: Int = 200
    open val cargoCapacity: Int = 250

    open fun performLoading() {
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

    override fun performLoading() {
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

    override fun performLoading() {
        println("Способен открывать ворота со стороны кормы.")
    }

    override fun infoShips() {
        println("Характеристика ледокола:\nСкорость: $speed\nКоличество пассажиров: $passengerCapacity")
    }
}

fun main() {
    val liner = Liner2()
    liner.infoShips()
    liner.performLoading()

    val cargoShip = CargoShip2()
    cargoShip.infoShips()
    cargoShip.performLoading()

    val iceBreaker = IceBreaker2()
    iceBreaker.infoShips()
    iceBreaker.performLoading()
}
