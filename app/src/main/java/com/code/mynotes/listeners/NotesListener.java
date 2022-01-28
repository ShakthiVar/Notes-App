package com.code.mynotes.listeners;

import com.code.mynotes.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
