class Gamer1(
    val name: String,
    var hasKey: Boolean,
)

fun main() {
    val checkKey: (Gamer1) -> String = { player ->
        if (player.hasKey) {
            "Игрок: ${player.name} открыл(a) дверь"
        } else {
            "Для игрока ${player.name} дверь заперта"
        }
    }
    val playerWithKey = Gamer1("Ekaterina", true)
    val playerWithoutKey = Gamer1("Nadezhda", false)
    println(checkKey(playerWithKey))
    println(checkKey(playerWithoutKey))
}
