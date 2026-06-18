fun main() {
    val ingredients = mutableListOf("Мука", "Яйца", "Молоко")
    println("В рецепте есть базовые ингредиенты: $ingredients")

    print("Желаете добавить еще? ")
    val answer = readln()

    // Сравниваем с "да" без учёта регистра
    if (answer.equals("да", ignoreCase = true)) {
        print("Какой ингредиент вы хотите добавить? ")
        val newIngredient = readln()
        ingredients.add(newIngredient)
        println("Теперь в рецепте есть следующие ингредиенты: $ingredients")
    } else {
        // Если ввели "нет", "не знаю" или что-угодно другое → программа завершается
        return
    }
}
