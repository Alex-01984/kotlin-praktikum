class ForumMember(val userId: Int, val userName: String)

class ForumMessage(val authorId: Int, val message: String)

class Forum {
    private var id = 0

    // списки для хранения данных (приватные)
    // список объектов ForumMember
    private val listForum = mutableListOf<ForumMember>()

    // список объектов ForumMessage
    private val forumMessages = mutableListOf<ForumMessage>()

    // Метод createNewUser(name: String): ForumMember
    fun createNewUser(name: String): ForumMember {
        // генерирует ID внутри
        id++
        // создаёт объект (скрыто)
        val newUser = ForumMember(id, name)
        // добавляет в список
        listForum.add(newUser)
        // возвращает готового пользователя
        return newUser
    }

    // Метод createNewMessage
    fun createNewMessage(
        authorId: Int,
        text: String,
    ): ForumMessage? {
        // проверяет, есть ли пользователь с таким ID
        if (listForum.any { it.userId == authorId }) {
            // если есть — создаёт и сохраняет сообщение
            val newMessage = ForumMessage(authorId, text)
            forumMessages.add(newMessage)
            return newMessage
        }
        return null
    }

    // печатает все сообщения добавленные на форум
    fun printThread() {
        for (message in forumMessages) {
            val author = listForum.find { message.authorId == it.userId }
            println("${author?.userName}: ${message.message}")
        }
    }
}

fun main() {
    val forum = Forum()
    val user1 = forum.createNewUser("Ekaterina")
    val user2 = forum.createNewUser("Nadezda")

    forum.createNewMessage(user1.userId, "Привет, форум!")
    forum.createNewMessage(user1.userId, "Изучаем программирование.")
    forum.createNewMessage(user2.userId, "Привет программистам!")
    forum.createNewMessage(user2.userId, "Изучаем язык программирования Kotlin")
    forum.printThread()
}
