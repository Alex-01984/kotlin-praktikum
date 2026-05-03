fun main() {
    val ingredients = listOf("Мука", "Яйца", "Молоко", "Масло")

    println("В рецепте есть следующие ингредиенты: $ingredients")
    // Выводим каждый ингредиент с новой строки
    ingredients.forEach { println(it) }
}
