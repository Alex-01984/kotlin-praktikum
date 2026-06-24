class Player(
    val name: String,
    var currentHealthLevel: Int,
    val maxHealthLevel: Int,
)

fun Player.isHealthy(): Boolean = currentHealthLevel == maxHealthLevel

fun main() {
    val player1 = Player("Ekaterina", 50, 100)
    val player2 = Player("Nadezhda", 100, 100)

    println(player1.isHealthy())
    println(player2.isHealthy())
}
