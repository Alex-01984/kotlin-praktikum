fun main() {
    val number = 6
    var table = ""

    for (i in 1..9) {
        table += "$number x $i = ${number * i}\n"
    }
    println(table)
}
