package com.jshvarts.lexiesample.presentation.notedetail

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.jshvarts.lexiesample.R
import com.jshvarts.lexiesample.domain.DeleteNoteUseCase
import com.jshvarts.lexiesample.domain.Note
import com.jshvarts.lexiesample.domain.NoteDetailUseCase
import kotlinx.android.synthetic.main.note_detail.*

const val EXTRA_DETAIL_ID = "notedetail.ID"

class NoteDetailActivity : AppCompatActivity() {
    private lateinit var viewModel: NoteDetailViewModel

    private val noteId by lazy {
        intent.getLongExtra(EXTRA_DETAIL_ID, 0)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.note_detail)

        // Normally the ViewModelFactory should be injected UseCases injected into it
        viewModel = ViewModelProviders.of(this, NoteDetailViewModelFactory(null, NoteDetailUseCase(), DeleteNoteUseCase()))
                .get(NoteDetailViewModel::class.java)

        viewModel.observableState.observe(this@NoteDetailActivity, Observer { state ->
            state?.let { renderState(state) }
        })

        if (savedInstanceState == null) {
            viewModel.dispatch(Action.LoadNoteDetail(noteId))
        }

        deleteNoteButton.setOnClickListener {
            viewModel.dispatch(Action.DeleteNote(noteId))
        }
    }

    private fun renderState(state: State) {
        with(state) {
            when {
                isLoadError -> renderLoadNoteDetailError()
                isDeleteError -> renderNoteDeleteError()
                note != null -> renderNoteDetailState(note)
                isNoteDeleted -> renderNoteDeleted()
            }
        }
    }

    private fun renderNoteDetailState(note: Note) {
        noteIdView.text = String.format(getString(R.string.note_detail_id), note.id)
        noteTextView.text = String.format(getString(R.string.note_detail_text), note.text)
    }

    private fun renderLoadNoteDetailError() {
        Toast.makeText(this, R.string.error_loading_note, Toast.LENGTH_LONG).show()
    }

    private fun renderNoteDeleteError() {
        Toast.makeText(this, R.string.error_deleting_note, Toast.LENGTH_LONG).show()
    }

    private fun renderNoteDeleted() {
        finish()
    }
}