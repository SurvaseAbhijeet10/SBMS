package com.sbms.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbms.entity.Notes;
import com.sbms.entity.User;
import com.sbms.repository.NotesRepo;
import com.sbms.repository.UserRepo;

@Service
public class NotesServices {

	@Autowired
	private NotesRepo notesRepo;
	
	@Autowired
	private UserRepo userRepo;


	public Notes saveNotes(Notes note, Integer userid) {

		
		  User users = userRepo.findById(userid) .orElseThrow(() -> new
		  RuntimeException("User not found"));
		  
		  
		  note.setUser(users);
		

        // Save the note
        return notesRepo.save(note);
	}

	public Optional<Notes> getNotes(Integer id) {

		System.out.println("id " + id);
		return notesRepo.findById(id);
	}
	

}


