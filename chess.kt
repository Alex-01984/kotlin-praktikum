fun main() {
    var whereFrom = "E2"
    var whereTo = "E4"
    var number = 1
    var move = "$whereFrom-$whereTo;$number"

    println(move)
    whereFrom = "D2"
    whereTo = "D3"
    number++
    move = "$whereFrom-$whereTo;$number"
    println(move)
}
