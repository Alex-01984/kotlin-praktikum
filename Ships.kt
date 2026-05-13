open class Liner(
    open val speed: Int = 60,
    open val passengerCapacity: Int = 200,
    open val cargoCapacity: Int = 250,
)

class Cargo(
    override val speed: Int = 40,
    override val passengerCapacity: Int = 40,
    override val cargoCapacity: Int = 600,
     /*speed = ← это имя параметра в конструкторе родителя (Liner)
     speed ← это значение параметра из конструктора потомка (Cargo) */
) : Liner(speed = speed, passengerCapacity = passengerCapacity, cargoCapacity = cargoCapacity)

class Icebreaker(
    override val speed: Int = 25,
    override val passengerCapacity: Int = 35,
    val canBreakIce: Boolean = true,
) : Liner(speed = speed, passengerCapacity = passengerCapacity)

fun main() {
    val liner = Liner()
    val cargo = Cargo()
    val icebreaker = Icebreaker()
}
