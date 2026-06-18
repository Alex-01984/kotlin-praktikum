fun main() {
    val ingredients = arrayOf("Мука", "Яйца", "Молоко", "Сахар", "Ванилин")
    println("Текущий список: ${ingredients.contentToString()}")
    print("Введите ингредиент который вы хотите заменить: ")
    val oldIngredient = readln()
    // Ищем индекс элемента. Если нет -> вернёт -1
    val index = ingredients.indexOf(oldIngredient)

    if (index == -1) {
        println("Такого ингредиента в списке нет.")
    } else {
        // Запрашиваем новый ингредиент
        print("Введите ингредиент, который хотите добавить: ")
        val newIngredient = readln()
        // 4. Заменяем элемент по найденному индексу
        ingredients[index] = newIngredient
        // Выводим обновлённый список
        println("Готово! Вы сохранили следующий список: ${ingredients.contentToString()}")
    }
}
