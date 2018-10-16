package com.jshvarts.lexiesample.data

import com.jshvarts.lexiesample.domain.Note

object NoteRepository {
    val notes by lazy {
        listOf(
                Note(1, "note1"),
                Note(2, "note2"),
                Note(3, "note3")
        )
    }
}