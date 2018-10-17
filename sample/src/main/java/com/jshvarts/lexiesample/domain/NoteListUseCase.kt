package com.jshvarts.lexiesample.domain

import com.jshvarts.lexiesample.data.NoteRepository
import io.reactivex.Single

class NoteListUseCase {
    fun loadAll(): Single<List<Note>> = Single.just(NoteRepository.loadAll())
}