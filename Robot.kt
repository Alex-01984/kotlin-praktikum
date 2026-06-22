class Robot(
    val phrases: List<String> =
        listOf(
            "Я робот",
            "Привет, человек",
            "Как дела",
            "Сегодня хорошая погода",
            "Я люблю программировать",
        ),
    var modifier: (String) -> String = { it },
) {
    fun say() {
        val phrase = phrases.random()
        val modifiedPhrase = modifier(phrase)
        println(modifiedPhrase)
    }

    fun applyModifier(newModifier: (String) -> String) {
        modifier = newModifier
    }
}

fun main() {
    val robot = Robot()
    robot.say()
    robot.say()
    robot.say()
    val invertWords: (String) -> String = { text ->
        text.split(" ").reversed().joinToString(" ")
    }

    robot.applyModifier(invertWords)
    // инвертированная фраза
    robot.say()
}
