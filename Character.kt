fun Map<String, Int>.maxCategory(): String? = maxByOrNull { it.value }?.key

fun main() {
    val skills =
        mapOf(
            "Сила" to 10,
            "Ловкость" to 25,
            "Интеллект" to 15,
        )
    val skills2 =
        mapOf(
            "Сила" to 25,
            "Ловкость" to 25,
            "Интеллект" to 15,
        )
    val skills3 = emptyMap<String, Int>()

    println(skills.maxCategory())
    println(skills2.maxCategory())
    println(skills3.maxCategory())
}
