class Gamer(
    val name: String,
    var currentHealthLevel: Int,
    val maxHealthLevel: Int,
) {
    fun printInfo(): String = "Игрок: $name - здоровье $currentHealthLevel"
}

val healingPotion: (Gamer) -> Unit = { player ->
    player.currentHealthLevel = player.maxHealthLevel
    println("Игрок ${player.name} вылечился")
}

fun main() {
    val gamer1 = Gamer("Ekaterina", 13, 20)
    println(gamer1.printInfo())
    healingPotion(gamer1)
    println(gamer1.printInfo())
}
