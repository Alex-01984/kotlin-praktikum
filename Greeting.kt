fun main() {
    val newYearGreeting: (String) -> String = { "С наступающим Новым Годом, $it!" }
    println(newYearGreeting("Ekaterina"))
}
