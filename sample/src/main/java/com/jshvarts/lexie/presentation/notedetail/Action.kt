package com.jshvarts.lexie.presentation.notedetail

import jshvarts.com.lexie.BaseAction

sealed class Action : BaseAction {
    data class LoadNoteDetail(val noteId: Long) : Action()
}