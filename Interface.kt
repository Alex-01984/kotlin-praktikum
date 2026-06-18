interface Flyable {
    fun fly()
}

interface Swimmable {
    fun swim()
}

class Crucian : Swimmable {
    override fun swim() = println("Карась плывёт")
}

class Seagull : Flyable {
    override fun fly() = println("Чайка летит")
}

class Duck : Flyable, Swimmable {
    override fun fly() = println("Утка летит")

    override fun swim() = println("Утка плывёт")
}

fun main() {
    val carp = Crucian()
    val seagull = Seagull()
    val duck = Duck()

    carp.swim()
    seagull.fly()
    duck.fly()
    duck.swim()
}
