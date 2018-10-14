package com.jshvarts.lexie.presentation.notelist

import com.jshvarts.lexie.domain.Note
import jshvarts.com.lexie.BaseState

data class State(val notes: List<Note> = listOf(),
                 val isIdle: Boolean = false,
                 val isLoading: Boolean = false,
                 val isError: Boolean = false) : BaseState