package com.jshvarts.lexie.presentation.notedetail

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.jshvarts.lexie.domain.NoteDetailUseCase

class NoteDetailViewModelFactory(private val initialState: State?,
                                 private val noteDetailUseCase: NoteDetailUseCase)
    : ViewModelProvider.NewInstanceFactory() {

    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NoteDetailViewModel(initialState, noteDetailUseCase) as T
    }
}