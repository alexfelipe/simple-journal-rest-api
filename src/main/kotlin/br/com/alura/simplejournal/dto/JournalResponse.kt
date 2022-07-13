package br.com.alura.simplejournal.dto

import br.com.alura.simplejournal.models.Journal
import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDateTime
import java.util.*

class JournalResponse(
    journal: Journal,
    val id: UUID = journal.id,
    val title: String = journal.title,
    val content: String = journal.content,
    @JsonFormat(pattern = "YYYY-MM-dd HH:MM:SS")
    val createdAt: LocalDateTime = journal.createdAt,
    @JsonFormat(pattern = "YYYY-MM-dd HH:MM:SS")
    val updatedAt: LocalDateTime? = journal.updatedAt
) {
    override fun toString(): String {
        return "JournalResponse(id=$id, title='$title', content='$content', createdAt=$createdAt, updatedAt=$updatedAt)"
    }
}
