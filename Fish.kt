enum class FishType(val fishName: String) {
    GUPPY("guppy"),
    ANGELFISH("angelfish"),
    GOLDFISH("goldfish"),
    SIAMESE_FIGHTING_FISH("siamese fighting fish"),
}

fun main() {
    println("Вы можете добавить следующих рыб:")
    for (i in FishType.entries) {
        println(i.fishName)
    }
}
