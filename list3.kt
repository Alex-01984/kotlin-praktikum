fun main() {
    val baseAmounts = listOf(2, 50, 15)

    println(
            "Список ингредиентов для одной порции: Яиц – ${baseAmounts[0]} шт, молока – ${baseAmounts[1]} мл, сливочного масла – ${baseAmounts[2]} гр"
    )
    print("Введите количество порций: ")
    val portions = readln().toInt()
    println(
            "На $portions порций вам понадобится: Яиц – ${baseAmounts[0] * portions} шт, молока – ${baseAmounts[1] * portions} мл, сливочного масла – ${baseAmounts[2] * portions} гр"
    )
}
