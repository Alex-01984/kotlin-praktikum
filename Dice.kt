abstract class Dice(val name: String, val sides: Int) {
    fun roll() {
        println("$name кубик брошен, выпало число: ${(1..sides).random()}")
    }
}

class Sides4 : Dice("4-х гранный", 4)

class Sides6 : Dice("6-х гранный", 6)

class Sides8 : Dice("8-х гранный", 8)

fun main() {
    val diceList: List<Dice> = listOf(Sides4(), Sides6(), Sides8())
    diceList.forEach { it.roll() }
}
