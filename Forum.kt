// KS-15-3: Исправленный код (перенос реализации в абстрактный класс)
abstract class ForumUser(val name: String) {
    fun readForum() = println("$name читает сообщения на форуме.")

    fun writeMessage() = println("$name пишет новое сообщение.")
}

class RegularUser(name: String) : ForumUser(name)

class Admin(name: String) : ForumUser(name) {
    fun deleteMessage() = println("$name удалил(а) сообщение.")

    fun deleteUser() = println("$name заблокировал(а) и удалил(а) пользователя.")
}

fun main() {
    val user = RegularUser("Алексей")
    user.readForum()
    user.writeMessage()
    val admin = Admin("Екатерина")
    admin.readForum()
    admin.writeMessage()
    admin.deleteMessage()
    admin.deleteUser()
}