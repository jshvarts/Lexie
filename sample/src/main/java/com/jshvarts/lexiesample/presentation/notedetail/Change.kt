package com.jshvarts.lexiesample.presentation.notedetail

import com.jshvarts.lexiesample.domain.Note

sealed class Change {
    object Loading : Change()
    data class NoteDetail(val note: Note) : Change()
    data class NoteLoadError(val throwable: Throwable?) : Change()
    object NoteDeleted : Change()
    data class NoteDeleteError(val throwable: Throwable?) : Change()
}