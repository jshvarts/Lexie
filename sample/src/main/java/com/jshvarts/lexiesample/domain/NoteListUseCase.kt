package com.jshvarts.lexiesample.domain

import com.jshvarts.lexiesample.data.NoteRepository
import io.reactivex.Single

class NoteListUseCase {
    fun loadNotes(): Single<List<Note>> = Single.just(NoteRepository.notes)
}