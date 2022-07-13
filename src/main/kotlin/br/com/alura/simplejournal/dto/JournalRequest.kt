package br.com.alura.simplejournal.dto

import br.com.alura.simplejournal.models.Journal
import java.util.*

class JournalRequest(
    private val title: String,
    private val content: String
) {
    fun toJournal(id: UUID = UUID.randomUUID()): Journal {
        return Journal(
            id = id,
            title = title,
            content = content
        )
    }

    override fun toString(): String {
        return "JournalRequest(title='$title', content='$content')"
    }

}
