package com.gestion.Etudiants.services;

import com.gestion.Etudiants.entities.Exam;
import com.gestion.Etudiants.entities.Note;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface NoteService {
    Note saveNote(Note note);
    Note updateNote(Note note);
    Note getNote(long idNote);
    List<Note> getAllNote();
    void deleteExamById(long idNote);
    void deleteAllNote();
}
