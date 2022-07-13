package br.com.alura.simplejournal

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimplejournalApplication

fun main(args: Array<String>) {
	runApplication<SimplejournalApplication>(*args)
}
