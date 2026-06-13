private const val PI_VALUE = 3.14

class Circle(private val radius: Double) {
    fun getArea(): Double = PI_VALUE * radius * radius

    fun getCircumference(): Double = 2 * PI_VALUE * radius
}

fun main() {
    val circle = Circle(5.0)

    println("Площадь круга: %.2f".format(circle.getArea()))
    println("Длина окружности: %.2f".format(circle.getCircumference()))
}
