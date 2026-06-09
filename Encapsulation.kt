class Cube {
    private val number = (1..6).random()

    fun printValue() {
        println("На кубике выпало число $number")
    }
}

fun main() {
    val cube = Cube()
    cube.printValue()
}
