package com.takenote.service;

import java.util.List;
import java.util.Optional;

import com.takenote.entity.Notes;
import com.takenote.entity.User;

public interface NotesService {
	
	Notes saveNotes(Notes notes);
	
	Notes noteById(Integer noteId);
	
	Optional<Notes> getNotesById(Integer noteId);
	
	List<Notes> getNotesByUser(User user);
	
	Notes updateNotes(Notes notes);
	
	boolean deleteNotes(Integer noteId);

}
