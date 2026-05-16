open class Message(
    val id: Int,
    val author: String,
    val text: String,
)

class ChildMessage(
    val parentMessageId: Int,
    id: Int,
    author: String,
    text: String,
) : Message(id, author, text)

class Chat(val messages: MutableList<Message> = mutableListOf()) {
    private var nextId = 1

    fun addMessage(
        author: String,
        text: String,
    ) {
        messages.add(Message(nextId, author, text))
        nextId++
    }

    fun addThreadMessage(
        parentMessageId: Int,
        author: String,
        text: String,
    ) {
        messages.add(ChildMessage(parentMessageId, nextId, author, text))
        nextId++
    }

    fun printChat() {
        val groups =
            messages.groupBy {
                    message ->
                if (message is ChildMessage) message.parentMessageId else message.id
            }
        for (group in groups.values) {
            for (msg in group) {
                if (msg is ChildMessage) {
                    println("\t${msg.author}: ${msg.text}")
                } else {
                    println("${msg.author}: ${msg.text}")
                }
            }
        }
    }
}

fun main() {
    val chat = Chat()
    chat.addMessage("Ekaterina", "Message to the chat")
    chat.addThreadMessage(1, "Ekaterina", "Message-2 to the chat")
    chat.printChat()
}
