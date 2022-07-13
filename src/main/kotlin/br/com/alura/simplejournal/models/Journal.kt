package br.com.alura.simplejournal.models

import java.time.LocalDateTime
import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Journal(
    @Id
    val id: UUID = UUID.randomUUID(),
    @Column(columnDefinition = "TEXT")
    val title: String = "",
    @Column(columnDefinition = "TEXT")
    val content: String = "",
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val updatedAt: LocalDateTime? = null
)