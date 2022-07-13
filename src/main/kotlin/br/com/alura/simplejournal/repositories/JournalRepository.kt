package br.com.alura.simplejournal.repositories

import br.com.alura.simplejournal.models.Journal
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface JournalRepository : CrudRepository<Journal, UUID>