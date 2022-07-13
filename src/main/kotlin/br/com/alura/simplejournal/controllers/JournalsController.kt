package br.com.alura.simplejournal.controllers

import br.com.alura.simplejournal.dto.JournalRequest
import br.com.alura.simplejournal.dto.JournalResponse
import br.com.alura.simplejournal.services.JournalService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RequestMapping("journals")
@RestController
class JournalsController(
    private val service: JournalService
) {

    @GetMapping
    fun allJournals(): ResponseEntity<List<JournalResponse>> {
        return service.findAll().let { journals ->
            val response = journals.map {
                JournalResponse(it)
            }
            ResponseEntity.ok(response)
        }
    }

    @PostMapping
    fun saveJournal(@RequestBody request: JournalRequest):
            ResponseEntity<JournalResponse> {
        val savedJournal = service.save(request.toJournal())
        return ResponseEntity
            .ok(JournalResponse(savedJournal))
    }

    @PutMapping("{id}")
    fun updateJournal(
        @RequestBody request: JournalRequest,
        @PathVariable("id") id: UUID
    ): ResponseEntity<JournalResponse> {
        val journal = request.toJournal(id)
        val savedJournal = service.save(journal)
        return ResponseEntity.ok(JournalResponse(savedJournal))
    }

    @DeleteMapping("{id}")
    fun deleteJournal(@PathVariable("id") id: UUID): ResponseEntity<Any> {
        return try {
            service.delete(id)
            ResponseEntity.ok().build()
        } catch (e: Exception) {
            e.printStackTrace()
            ResponseEntity.notFound().build()
        }
    }

}


