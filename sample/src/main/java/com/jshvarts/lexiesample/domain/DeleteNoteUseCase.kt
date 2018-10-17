package com.jshvarts.lexiesample.domain

import com.jshvarts.lexiesample.data.NoteRepository
import io.reactivex.Completable

class DeleteNoteUseCase {
    fun delete(note: Note): Completable =
            when {
                NoteRepository.delete(note) -> Completable.complete()
                else -> Completable.error(RuntimeException("Unable to delete note $note"))
            }
}