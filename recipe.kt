fun main() {
    val ingredients = arrayOf("Мука", "Яйца", "Молоко", "Сахар", "Ванилин")
    print("Введите название ингредиента: ")
    val ingredient = readln()

    for (element in ingredients) {
        if (ingredient == element) {
            println("Ингредиент $ingredient в рецепте есть")
            return
        }
    }

    println("Такого ингредиента в рецепте нет")
}
