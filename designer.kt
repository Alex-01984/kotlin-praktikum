fun main() {
    print("Введите количество планируемых ингредиентов: ")
    val count = readln().toInt()

    // Создаём массив фиксированного размера (временная инициализация пустыми строками)
    val ingredients = Array(count) { "" }

    // Поэлементный ввод с явными подсказками
    for (i in 0 until count) {
        print("Введите ингредиент №${i + 1}: ")
        ingredients[i] = readln()
    }

    println("Список ингредиентов: ${ingredients.joinToString(", ")}")
}
