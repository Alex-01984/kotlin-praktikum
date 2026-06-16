class Order(val orderNumber: Int) {
    fun makeOrder(product: String) {
        println("Заказан товар: $product")
    }

    fun makeOrder(products: List<String>) {
        println("Заказаны следующие товары: ${products.joinToString(", ")}")
    }
}

fun main() {
    val order1 = Order(101)
    order1.makeOrder("Товар_1")
    val order2 = Order(102)
    order2.makeOrder(listOf("Товар_1", "Товар_2", "Товар_3"))
}
