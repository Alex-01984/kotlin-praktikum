fun String.vowelCount(): Int {
    val vowels = "aeiouAEIOU"
    return count { it in vowels }
}

fun main() {
    println("hello".vowelCount())
}
