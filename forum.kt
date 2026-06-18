class ForumMember(val userId: Int, val userName: String)

class ForumMessage(val authorId: Int, val message: String)

class Forum {
    private var id = 0
    private val listForum = mutableListOf<ForumMember>()
    private val forumMessages = mutableListOf<ForumMessage>()

    fun createNewUser(name: String): ForumMember {
        id++
        val newUser = ForumMember(id, name)
        listForum.add(newUser)
        return newUser
    }

    fun createNewMessage(
        authorId: Int,
        text: String,
    ): ForumMessage? {
        if (listForum.any { it.userId == authorId }) {
            val newMessage = ForumMessage(authorId, text)
            forumMessages.add(newMessage)
            return newMessage
        }
        return null
    }

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
