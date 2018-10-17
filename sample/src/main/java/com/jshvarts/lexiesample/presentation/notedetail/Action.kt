package com.jshvarts.lexiesample.presentation.notedetail

import com.jshvarts.lexie.BaseAction

sealed class Action : BaseAction {
    data class LoadNoteDetail(val noteId: Long) : Action()
    data class DeleteNote(val noteId: Long) : Action()
}