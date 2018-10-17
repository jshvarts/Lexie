package com.jshvarts.lexiesample.domain

import com.jshvarts.lexiesample.data.NoteRepository
import io.reactivex.Single

class NoteDetailUseCase {
    fun findById(id: Long): Single<Note> {
        return NoteRepository.findById(id)?.let { note ->
            Single.just(note)
        } ?: Single.error(IllegalArgumentException("Invalid note id passed in"))
    }
}