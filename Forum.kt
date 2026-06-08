abstract class ForumUser(val name: String) {
    abstract fun readForum()

    abstract fun writeMessage()
}

class RegularUser(name: String) : ForumUser(name) {
    override fun readForum() = println("$name читает сообщения на форуме.")

    override fun writeMessage() = println("$name пишет новое сообщение.")
}

class Admin(name: String) : ForumUser(name) {
    override fun readForum() = println("$name (администратор) читает сообщения на форуме.")

    override fun writeMessage() = println("$name (администратор) пишет новое сообщение.")

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
