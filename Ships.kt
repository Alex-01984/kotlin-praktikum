open class Liner {
    open val speed: Int = 60
    open val passengerCapacity: Int = 200
    open val cargoCapacity: Int = 250
}

class CargoShip : Liner() {
    override val speed: Int = 40
    override val passengerCapacity: Int = 40
    override val cargoCapacity: Int = 600
}

class Icebreaker : Liner() {
    override val speed: Int = 25
    override val passengerCapacity: Int = 35
    val canBreakIce: Boolean = true
}

fun main() {
    val liner = Liner()
    val cargo = CargoShip()
    val icebreaker = Icebreaker()
}
