package com.olujide.noteapp;

import androidx.cardview.widget.CardView;

import com.olujide.noteapp.Models.Notes;

public interface NotesClickListener {

    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
