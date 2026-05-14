const val COLOR_BLACK = "black"
const val COLOR_WHITE = "white"

abstract class Figure(val color: String) {
    abstract fun area(): Double

    abstract fun perimeter(): Double
}

class Rectangle(color: String, val width: Double, val height: Double) : Figure(color) {
    override fun area() = width * height

    override fun perimeter() = 2 * (width + height)
}

class Circle(color: String, val radius: Double) : Figure(color) {
    override fun area(): Double = kotlin.math.PI * radius * radius

    override fun perimeter(): Double = 2 * kotlin.math.PI * radius
}

fun main() {
    val figures =
        listOf<Figure>(
            Rectangle(COLOR_BLACK, 3.2, 3.3),
            Rectangle(COLOR_BLACK, 4.2, 5.3),
            Rectangle(COLOR_WHITE, 4.2, 5.3),
            Rectangle(COLOR_WHITE, 6.2, 5.0),
            Circle(COLOR_BLACK, 5.6),
            Circle(COLOR_BLACK, 4.2),
            Circle(COLOR_BLACK, 5.6),
        )
    val sumPerimeter = figures.filter { it.color == "black" }.sumOf { it.perimeter() }
    val sumArea = figures.filter { it.color == "white" }.sumOf { it.area() }

    println(
        "Сумма периметров всех черных фигур: $sumPerimeter\nСумма площадей всех белых фигур: $sumArea",
    )
}
