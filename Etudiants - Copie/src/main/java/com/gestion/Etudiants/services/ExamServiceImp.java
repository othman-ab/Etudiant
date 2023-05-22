package com.gestion.Etudiants.services;

import com.gestion.Etudiants.entities.Exam;
import com.gestion.Etudiants.repositories.EtudiantRepository;
import com.gestion.Etudiants.repositories.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExamServiceImp implements ExamService {
    @Autowired

    ExamRepository examRepository;
    private final EtudiantRepository etudiantRepository;

    public ExamServiceImp(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }

    @Override
    public Exam saveExam(Exam exam) {
        return examRepository.save(exam);
    }

    @Override
    public Exam updateExam(Exam exam) {
        return examRepository.save(exam);
    }

    @Override
    public Exam getExam(long idExam) {
        return examRepository.findById(idExam).get();
    }

    @Override
    public List<Exam> getAllExam() {
        return examRepository.findAll();
    }

    @Override
    public void deleteExamById(long idExam) {
    etudiantRepository.deleteById(idExam);
    }

    @Override
    public void deleteAllExam() {
        etudiantRepository.deleteAll();

    }
}
