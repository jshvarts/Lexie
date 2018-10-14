package com.jshvarts.lexie.presentation.notelist

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.jshvarts.lexie.domain.NoteListUseCase

class NoteListViewModelFactory(private val initialState: State?,
                               private val noteListUseCase: NoteListUseCase)
    : ViewModelProvider.NewInstanceFactory() {

    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NoteListViewModel(initialState, noteListUseCase) as T
    }
}