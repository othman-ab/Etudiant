package com.gestion.Etudiants.services;

import com.gestion.Etudiants.entities.Cours;
import com.gestion.Etudiants.entities.Etudiant;
import com.gestion.Etudiants.repositories.CoursRepository;
import com.gestion.Etudiants.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CoursServiceImp implements CoursService{
    @Autowired
    CoursRepository coursRepository;
    @Override
    public Cours saveCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public Cours updateCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public Cours getCours(long idCour) {
        return coursRepository.findById(idCour).get();
    }

    @Override
    public List<Cours> getAllCours() {
        return coursRepository.findAll();
    }

    @Override
    public void deleteCoursById(long idCour) {
        coursRepository.deleteById(idCour);
    }

    @Override
    public void deleteAllCours() {
        coursRepository.deleteAll();
    }
}
