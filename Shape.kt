abstract class Figure(val color: String) {
    abstract fun area(): Double

    abstract fun perimeter(): Double
}

class Rectangle(color: String, val w: Double, val h: Double) : Figure(color) {
    override fun area() = w * h

    override fun perimeter() = 2 * (w + h)
}

class Circle(color: String, val radius: Double) : Figure(color) {
    override fun area(): Double = kotlin.math.PI * radius * radius

    override fun perimeter(): Double = 2 * kotlin.math.PI * radius
}

fun main() {
    val figures =
        listOf<Figure>(
            Rectangle("black", 3.2, 3.3),
            Rectangle("black", 4.2, 5.3),
            Rectangle("white", 4.2, 5.3),
            Rectangle("white", 6.2, 5.0),
            Circle("black", 5.6),
            Circle("black", 4.2),
            Circle("white", 5.6),
        )
    val sumPerimeter = figures.filter { it.color == "black" }.sumOf { it.perimeter() }
    val sumArea = figures.filter { it.color == "white" }.sumOf { it.area() }

    println(
        "Сумма периметров всех черных фигур: $sumPerimeter\nСумма площадей всех белых фигур: $sumArea",
    )
}
