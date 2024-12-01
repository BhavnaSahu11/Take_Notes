package com.takenote.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.takenote.entity.Notes;
import com.takenote.entity.User;

public interface NotesRepository extends JpaRepository<Notes, Integer> {
	
	
	List<Notes> findByUser(User user);

}
