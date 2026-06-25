import java.io.File

fun File.writeToBeginning(word: String) {
    val lowerWord = word.lowercase()
    val existingContent =
        if (this.exists()) {
            this.readText()
        } else {
            ""
        }
    val newContent = "$lowerWord\n$existingContent"
    this.writeText(newContent)
}

fun main() {
    val file = File("test.txt")

    file.writeToBeginning("Hello")
    file.writeToBeginning("World")
}
