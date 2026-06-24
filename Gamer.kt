class Gamer(
    val name: String,
    var curretHealthLevel: Int,
    val maxHealthLevel: Int,
)

fun Gamer.isHealthy(): Boolean = curretHealthLevel == maxHealthLevel

fun main() {
    val player1 = Gamer("Ekaterina", 50, 100)
    val player2 = Gamer("Nadezhda", 100, 100)

    println(player1.isHealthy())
    println(player2.isHealthy())
}
