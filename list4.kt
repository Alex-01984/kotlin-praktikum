fun main() {
    println("Введите 5 ингредиентов через \", \" (запятая с пробелом):")
    val input = readln()
    val ingredients = input.split(", ")
    val sortedIngredients = ingredients.sorted()
    println("Отсортированный список: ${sortedIngredients.joinToString(", ")}")
}
