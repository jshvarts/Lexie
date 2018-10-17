package com.jshvarts.lexiesample.presentation.notedetail

import com.jshvarts.lexiesample.domain.Note
import com.jshvarts.lexie.BaseState

data class State(val note: Note? = null,
                 val isIdle: Boolean = false,
                 val isLoading: Boolean = false,
                 val isLoadError: Boolean = false,
                 val isNoteDeleted: Boolean = false,
                 val isDeleteError: Boolean = false) : BaseState