class VoiceRoom(
    // ресурс обложки комнаты
    val coverImage: String,
    // название комнаты
    val name: String,
        /*список участников
        Тип свойства. MutableList — это изменяемый список (интерфейс коллекции Kotlin). Угловые скобки <Participant> — это параметр типа (generics). Они говорят компилятору: «в этом списке могут храниться только объекты класса Participant». */
    val participants: MutableList<Participant> = mutableListOf(),
) {
    fun addParticipant(participant: Participant) {
        participants.add(participant)
    }

    fun updateStatus(
        nickname: String,
        newStatus: ParticipantStatus,
    ) {
        participants.find { it.nickname == nickname }?.status = newStatus
    }
}

class Participant(val avatar: String, val nickname: String, var status: ParticipantStatus)

// enum (от enumeration — перечисление) объявляет специальный тип данных, который содержит
// фиксированный, ограниченный набор именованных констант.
enum class ParticipantStatus {
    SPEAKING, // разговаривает
    MUTE, // микрофон выключен
    BLOCKED, // пользователь заглушен
}

fun main() {
    val room = VoiceRoom(coverImage = "cover.png", name = "Kotlin Talks")
    room.addParticipant(Participant("avatar1.png", "Ekaterina", ParticipantStatus.SPEAKING))
    room.addParticipant(Participant("avatar2.png", "Nadezhda", ParticipantStatus.MUTE))
    room.updateStatus("Nadezhda", ParticipantStatus.BLOCKED)
    println("${room.name}: ${room.participants.map { "${it.nickname} = ${it.status}" }}")
}
