class Folder(name: String, fileCount: Int, isSecret: Boolean) {
    private val _name: String = name
    private val _fileCount: Int = fileCount
    val isSecret: Boolean = isSecret
    val name: String
        get() = if (isSecret) "Скрытая папка" else _name
    val fileCount: Int
        get() = if (isSecret) 0 else _fileCount
}

fun main() {
    val folder1 = Folder("Books", 32, false)
    println("В папке ${folder1.name} количество файлов: ${folder1.fileCount}.")
    val folder2 = Folder("Password", 5, true)
    println("В папке ${folder2.name} количество файлов: ${folder2.fileCount}.")
}
