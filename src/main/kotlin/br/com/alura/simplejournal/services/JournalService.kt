package br.com.alura.simplejournal.services

import br.com.alura.simplejournal.models.Journal
import br.com.alura.simplejournal.repositories.JournalRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class JournalService(
    private val repository: JournalRepository
) {

    fun findAll(): Iterable<Journal> = repository.findAll()

    fun save(journal: Journal): Journal = repository.save(journal)

    fun delete(id: UUID) {
        repository.deleteById(id)
    }

}
