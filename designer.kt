fun main() {
    print("Введите количество планируемых ингредиентов: ")
    val numberIngredients = readln().toInt()
    print("Введите ингредиенты: ")
    val arr = Array(numberIngredients) { readln() }
    println("Список ингредиентов: ${arr.joinToString(", ")}")
}
