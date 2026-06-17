abstract class Animal(val name: String) {
    abstract val food: String

    fun sleep() {
        println("$name спит")
    }

    fun eat() {
        println("$name ест $food")
    }
}

class Fox(name: String) : Animal(name) {
    override val food = "ягодки"
}

class Cat(name: String) : Animal(name) {
    override val food = "рыбку"
}

class Dog(name: String) : Animal(name) {
    override val food = "косточку"
}

fun main() {
    val animals: List<Animal> =
        listOf(
            Fox("Лиса"),
            Cat("Кошка"),
            Dog("Собака"),
        )

    animals.forEach { it.eat() }
}
