package com.jshvarts.lexie.presentation.notedetail

import com.jshvarts.lexie.domain.Note

sealed class Change {
    object Loading : Change()
    data class NoteDetail(val note: Note) : Change()
    data class NoteLoadError(val throwable: Throwable?) : Change()
}