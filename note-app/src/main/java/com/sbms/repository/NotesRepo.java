package com.sbms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbms.entity.Notes;

@Repository
public interface NotesRepo extends JpaRepository<Notes, Integer> {

}
