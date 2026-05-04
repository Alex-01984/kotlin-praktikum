fun main() {
    val baseAmounts = listOf(2, 50, 15)

    println(
            "Список ингредиентов для одной порции: Яиц – ${baseAmounts[0]} шт, молока – ${baseAmounts[1]} мл, сливочного масла – ${baseAmounts[2]} гр"
    )
    print("Введите количество порций: ")
    val portions = readln().toInt()
    // Внутри map каждый элемент (it) умножается на portions
    val scaledIngredients = baseAmounts.map { it * portions }
    println(
            "На $portions порций вам понадобится: Яиц – ${scaledIngredients[0]} шт, молока – ${scaledIngredients[1]} мл, сливочного масла – ${scaledIngredients[2]} гр"
    )
}
