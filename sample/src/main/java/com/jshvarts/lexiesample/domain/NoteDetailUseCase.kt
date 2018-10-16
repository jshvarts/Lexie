package com.jshvarts.lexiesample.domain

import com.jshvarts.lexiesample.data.NoteRepository
import io.reactivex.Single

class NoteDetailUseCase {
    fun findById(id: Long): Single<Note> {
        val note = NoteRepository.notes.firstOrNull { it.id == id }
        return note?.let {
            Single.just(note)
        } ?: Single.error(IllegalArgumentException("Invalid note id passed in"))
    }
}