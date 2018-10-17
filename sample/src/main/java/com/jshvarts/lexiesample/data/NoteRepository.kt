package com.jshvarts.lexiesample.data

import com.jshvarts.lexiesample.domain.Note

/**
 * Normally we would implement a repository interface which is injected in the Domain layer
 */
object NoteRepository {
    private val notes = mutableListOf(
            Note(1, "note1"),
            Note(2, "note2"),
            Note(3, "note3")
    )

    fun loadAll(): List<Note> = notes.toList()

    fun findById(id: Long): Note? = notes.firstOrNull { it.id == id }

    fun delete(note: Note): Boolean = notes.remove(note)
}