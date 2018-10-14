package com.jshvarts.lexie.presentation.notedetail

import com.jshvarts.lexie.domain.Note
import jshvarts.com.lexie.BaseState

data class State(val note: Note? = null,
                 val isIdle: Boolean = false,
                 val isLoading: Boolean = false,
                 val isError: Boolean = false) : BaseState