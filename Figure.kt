class Circle(val radius: Double)

class Square(val side: Double)

class Point

class Screen() {
    fun draw(
        circle: Circle,
        x: Int,
        y: Int,
    ): String = "Нарисован круг в координатах ($x, $y) с радиусом ${circle.radius}"

    fun draw(
        circle: Circle,
        x: Float,
        y: Float,
    ): String = "Нарисован круг в координатах ($x, $y) с радиусом ${circle.radius}"

    fun draw(
        square: Square,
        x: Int,
        y: Int,
    ): String = "Нарисован квадрат в координатах ($x, $y) с длиной стороны ${square.side}"

    fun draw(
        square: Square,
        x: Float,
        y: Float,
    ): String = "Нарисован квадрат в координатах ($x, $y) с длиной стороны ${square.side}"

    fun draw(
        point: Point,
        x: Int,
        y: Int,
    ): String = "Нарисована точка в координатах ($x, $y)"

    fun draw(
        point: Point,
        x: Float,
        y: Float,
    ): String = "Нарисована точка в координатах ($x, $y)"
}

fun main() {
    val screen = Screen()
    val circle = Circle(5.0)
    val square = Square(3.5)
    val point = Point()

    println(screen.draw(circle, 10, 20))
    println(screen.draw(circle, 10.5f, 20.5f))
    println(screen.draw(square, 15, 25))
    println(screen.draw(square, 15.5f, 25.5f))
    println(screen.draw(point, 30, 40))
    println(screen.draw(point, 30.5f, 40.5f))
}
