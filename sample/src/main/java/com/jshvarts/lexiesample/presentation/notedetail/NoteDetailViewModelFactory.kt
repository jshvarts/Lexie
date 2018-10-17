package com.jshvarts.lexiesample.presentation.notedetail

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.jshvarts.lexiesample.domain.DeleteNoteUseCase
import com.jshvarts.lexiesample.domain.NoteDetailUseCase

class NoteDetailViewModelFactory(private val initialState: State?,
                                 private val noteDetailUseCase: NoteDetailUseCase,
                                 private val deleteNoteUseCase: DeleteNoteUseCase)
    : ViewModelProvider.NewInstanceFactory() {

    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NoteDetailViewModel(initialState, noteDetailUseCase, deleteNoteUseCase) as T
    }
}