abstract class Product(val name: String, val quantity: Int)

interface Searchable {
    fun searchAccessories()
}

class Instrument(name: String, quantity: Int) : Product(name, quantity), Searchable {
    override fun searchAccessories() = println("Выполняется поиск комплектующих для $name...")
}

class Accessory(name: String, quantity: Int) : Product(name, quantity)

fun main() {
    val guitar = Instrument("Электрогитара", 5)
    val strings = Accessory("Струны", 50)

    println("На складе: ${guitar.name}, количество: ${guitar.quantity}")
    guitar.searchAccessories()
    println("На складе: ${strings.name}, количество: ${strings.quantity}")
}
