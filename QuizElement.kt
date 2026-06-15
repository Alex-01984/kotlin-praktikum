class QuizItem(question: String, answer: String = "") {
    val question: String = question
        get() = field

    var answer: String = answer
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val element = QuizItem("Как называется столица Англии?")
    element.answer = "Лондон"
    println("Вопрос: ${element.question} Ответ: ${element.answer}")
}
