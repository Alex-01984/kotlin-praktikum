class Package(val trackingNumber: Int, currentLocation: String) {
    var currentLocation: String = currentLocation
        set(value) {
            field = value
            moveCount++
        }
    var moveCount: Int = 1
}

fun main() {
    val package1 = Package(123, "Москва")
    println("Посылка № ${package1.trackingNumber}, ${package1.currentLocation}, перемещений: ${package1.moveCount}")
    package1.currentLocation = "Новгород"
    println("Посылка № ${package1.trackingNumber}, ${package1.currentLocation}, перемещений: ${package1.moveCount}")
}
