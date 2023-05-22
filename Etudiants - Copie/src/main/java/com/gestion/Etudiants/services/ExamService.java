package com.gestion.Etudiants.services;

import com.gestion.Etudiants.entities.Etudiant;
import com.gestion.Etudiants.entities.Exam;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ExamService {
    Exam saveExam(Exam exam);
    Exam updateExam(Exam exam);
    Exam getExam(long idExam);
    List<Exam> getAllExam();
    void deleteExamById(long idExam);
    void deleteAllExam();
}
