fun main() {
    val ingredients = arrayOf("Мука", "Яйца", "Молоко", "Сахар", "Ванилин")
    print("Введите название ингредиента: ")
    val ingredient = readln()

    if (ingredient in ingredients) {
        println("Ингредиент $ingredient в рецепте есть")
        return
    }

    println("Такого ингредиента в рецепте нет")
}
