abstract class Package {
    abstract fun calculateArea(): Double
}

class RectangularBox(val height: Double, val width: Double, val length: Double) : Package() {
    override fun calculateArea(): Double = 2 * (height * width + width * length + height * length)
}

class CubeBox(val length: Double) : Package() {
    override fun calculateArea(): Double = 6 * (length * length)
}

fun main() {
    val packages: List<Package> = listOf(RectangularBox(2.0, 3.0, 4.0), CubeBox(3.2))
    packages.forEach {
        println("${it::class.simpleName}: Площадь поверхности посылки %.2f".format(it.calculateArea()))
    }
}
