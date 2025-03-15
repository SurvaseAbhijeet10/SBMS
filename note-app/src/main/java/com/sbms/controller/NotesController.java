package com.sbms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sbms.entity.Notes;
import com.sbms.services.NotesServices;

@RestController
@RequestMapping("/api/notes")
public class NotesController {

    @Autowired
    private NotesServices notesServices;

    @PostMapping("/{userId}")
    public ResponseEntity<Notes> createNote(@PathVariable Integer userId, @RequestBody Notes note) {
        Notes savedNote = notesServices.saveNotes(note, userId);
        return new ResponseEntity<>(savedNote, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Notes> getNoteById(@PathVariable Integer id) {
        return notesServices.getNotes(id)
            .map(note -> new ResponseEntity<>(note, HttpStatus.OK))
            .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}