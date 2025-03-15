package com.sbms.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbms.entity.Notes;
import com.sbms.services.NotesServices;

@RestController
public class NotesController {

	@Autowired
	private NotesServices noteService;

	@PostMapping("/notes")
	public ResponseEntity<Notes> createNotes(@RequestBody Notes noteById) {
		System.out.println("Hi.." + noteById.toString());
		Notes saveNotes = noteService.saveNotes(noteById, 1);

		return new ResponseEntity<>(saveNotes, HttpStatus.CREATED);
	}

	@GetMapping("/notes/{id}")
	public ResponseEntity<?> getNote(@PathVariable("id") Integer id) {

		Optional<Notes> optionalNote = noteService.getNotes(id);

		return new ResponseEntity(optionalNote, HttpStatus.OK);
	}

}
