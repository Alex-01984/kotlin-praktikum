fun main() {
    val elements = listOf("button_1", "button_2", "button_3", "button_4", "button_5")
    val lambdas =
        elements.map { element ->
            {
                println("Нажат элемент $element")
            }
        }

    lambdas.forEachIndexed { index, lambda ->
        if (index % 2 == 0) {
            lambda()
        }
    }
}
