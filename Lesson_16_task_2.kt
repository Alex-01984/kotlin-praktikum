import kotlin.math.pow

private const val PI_VALUE = 3.14

class Circle(private val radius: Double) {
    fun calculateArea(): Double = PI_VALUE * radius.pow(2.0)

    fun calculatePerimeter(): Double = 2 * PI_VALUE * radius
}

fun main() {
    val circle = Circle(5.0)

    println("Длина окружности: %.2f".format(circle.calculatePerimeter()))
    println("Площадь круга: %.2f".format(circle.calculateArea()))
}
