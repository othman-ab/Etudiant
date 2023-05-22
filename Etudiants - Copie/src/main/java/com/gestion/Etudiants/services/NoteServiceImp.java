package com.gestion.Etudiants.services;

import com.gestion.Etudiants.entities.Note;
import com.gestion.Etudiants.repositories.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NoteServiceImp implements NoteService {
    @Autowired
    NoteRepository noteRepository;
    @Override
    public Note saveNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public Note updateNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public Note getNote(long idNote) {
        return noteRepository.findById(idNote).get();
    }

    @Override
    public List<Note> getAllNote() {
        return noteRepository.findAll();
    }

    @Override
    public void deleteExamById(long idNote) {
      noteRepository.deleteById(idNote);
    }

    @Override
    public void deleteAllNote() {
    noteRepository.deleteAll();
    }
}
