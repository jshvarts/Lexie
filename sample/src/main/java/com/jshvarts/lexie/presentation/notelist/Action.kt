package com.jshvarts.lexie.presentation.notelist

import jshvarts.com.lexie.BaseAction

sealed class Action : BaseAction {
    object LoadNotes : Action()
}