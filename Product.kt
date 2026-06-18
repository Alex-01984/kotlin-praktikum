enum class ProductCategory {
    CLOTHING,
    STATIONERY,
    OTHER,
    ;

    fun getDisplayName(): String =
        when (this) {
            CLOTHING -> "Одежда"
            STATIONERY -> "Канцелярские товары"
            OTHER -> "Разное"
        }
}

class Product(
    val id: Int,
    val name: String,
    val category: ProductCategory,
) {
    fun printInfo() {
        println("Товар №$id - $name, категория: ${category.getDisplayName()}")
    }
}

fun main() {
    val product1 =
        Product(
            id = 1,
            name = "Футболка",
            category = ProductCategory.CLOTHING,
        )
    val product2 =
        Product(
            id = 2,
            name = "Ручка шариковая",
            category = ProductCategory.STATIONERY,
        )
    val product3 =
        Product(
            id = 3,
            name = "Книга",
            category = ProductCategory.OTHER,
        )

    product1.printInfo()
    product2.printInfo()
    product3.printInfo()
}
