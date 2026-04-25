fun main() {
    val move = "D2-D4;0"
    val parts = move.split("-", ";")
    val whereFrom = parts[0]
    val whereTo = parts[1]
    val number = parts[2]

    println(whereFrom)
    println(whereTo)
    println(number)
}
