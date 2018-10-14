package com.jshvarts.lexie.presentation.notelist

import com.jshvarts.lexie.domain.Note

sealed class Change {
    object Loading : Change()
    data class Notes(val notes: List<Note>) : Change()
    data class Error(val throwable: Throwable?) : Change()
}